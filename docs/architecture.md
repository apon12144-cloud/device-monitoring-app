# Architecture Overview

## 1. Product vision

The application is designed to support a user-aware device linking and monitoring flow. The user begins in the app, signs in, and then lands on a home dashboard. From there they can add a device, select an existing device, and choose a monitoring action such as screen viewing, camera view, or audio capture.

## 2. Navigation model

### Initial flow

- App launch
- Authentication / registration / sign-in
- Home page

### Home page actions

- Add new device
- Select device
- Live screen
- Live camera
- Live audio with recording

## 3. App components

### Presentation layer
- `MainActivity`
- Home screen
- Device selection screen
- Monitoring screens
- Navigation graph

### ViewModel layer
- Device state management
- Authentication state
- Connection state
- Monitoring session state

### Repository / data layer
- Device repository
- Connectivity state
- Session persistence
- Link-sharing metadata

### Service layer
- Background connection service
- Reconnect manager
- Monitoring service

## 4. Flow model

```text
User -> App -> Sign In -> Home Screen
      -> Add Device -> Link/Video Handoff -> Device Linked
      -> Device List -> Choose Device
      -> Monitoring Options -> Live Screen / Camera / Audio
      -> Background Session -> Auto Reconnect When Device Returns Online
```

## 5. Connection logic

### Network requirements
- Connection depends on internet availability for the target device
- Wi-Fi or mobile data can be used when the device is online

### Reconnect behavior
- When offline, the app re-attempts connection multiple times
- The system keeps retrying until the device becomes reachable again
- Once the device reconnects, the session continues without a full manual re-link

## 6. Session behavior

- Device link remains active for a bounded session window
- Session duration can be configured for a temporary active period
- Background operation keeps the device linked while the app remains active in the background
- Monitoring continues while the device user performs ordinary activities, as long as the connection is stable

## 7. Suggested module structure

```text
app/
  src/main/java/com/example/devicemonitoring/
    model/
    data/
    service/
    ui/
    viewmodel/
    navigation/
    util/
```

## 8. Implementation recommendations

- Keep device state in a single ViewModel or state holder
- Build a connection manager to centralize retry logic
- Use a foreground service for long-running background monitoring
- Use lifecycle-aware UI and state observation
- Separate network, repository, and UI concerns to keep the app testable

## 9. Security and privacy constraints

- Require explicit user awareness and consent before linking a device
- Do not hide the linking flow or apply stealth-mode connection behavior
- Keep monitoring session expiration explicit
- Enforce least-privilege permissions for camera and microphone access
- Provide clear user-facing controls to disconnect or stop the stream
