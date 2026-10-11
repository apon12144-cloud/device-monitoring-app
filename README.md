# Device Monitoring App

A consent-based Android application for linking and monitoring an online target device, with a user-aware device linking flow, session persistence, and monitoring controls.

## Project goals

- Simplify device registration and sign-in flows
- Provide a bounded home dashboard for linked devices
- Support device linking via a secure shareable link or video handoff
- Maintain a background connection strategy for temporary monitoring sessions
- Surface live monitoring options such as screen, camera, and audio recording

## High-level user journey

1. Registration / sign-in
2. Home screen
3. Add new device
4. Select device from list
5. Monitor via live screen, camera, or audio

## Architecture summary

This repository includes a starter Android project scaffold built with:

- Kotlin
- Jetpack Compose
- ViewModel + Repository pattern
- Navigation component
- Background service hooks for reconnect logic and monitoring sessions

## Repository layout

- `app/` — Android application module
- `docs/` — app architecture and implementation notes
- `README.md` — project overview

## Notes

This repository is intentionally structured as a design-and-skeleton project. It reflects a consent-based remote support and monitoring workflow rather than a hidden or surreptitious monitoring pattern.

## License

MIT
