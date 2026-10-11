# App Flow and Feature Breakdown

## Home screen

The home screen is the central entry point after registration or sign-in. It presents the user with the main actions:

- Connect device / add new device
- Device selection and existing inventory
- Live monitoring actions

## Device linking flow

A device can be linked using a link or a video-based transfer flow. The user can open the shared link or follow the assisted handoff process. This is treated as a user-aware pairing action and is designed to avoid a confusing or unexpected connection state.

## Supported monitoring actions

- Live screen
- Live camera
- Live audio
- Recording support for audio and related monitoring sessions

## Device list

The device list acts as the primary selection layer. It allows users to switch between linked devices and review available connected states.

## Session lifecycle

- Device is linked
- Session becomes active
- App continues to operate in background
- Monitoring remains available while the target device remains online
- Reconnect attempts continue when the device temporarily disconnects

## Example flow

```text
Start App
  -> Sign In / Register
  -> Home Screen
  -> Add Device
  -> Share/Receive Link or Video
  -> Linked Device Appears in List
  -> Select Device
  -> Monitor Live Screen / Camera / Audio
  -> Continue in Background
  -> Retry if Device Offline
  -> Resume Monitoring Once Online
```

## Suggested responsibilities

### `HomeScreen`
Displays actions and device summary

### `DeviceSelectionScreen`
Shows linked devices and quick selection actions

### `DeviceViewModel`
Tracks list, state, and selected device

### `ConnectionService`
Wraps connection and reconnect behavior

### `MonitoringService`
Handles live monitoring actions and stream lifecycle
