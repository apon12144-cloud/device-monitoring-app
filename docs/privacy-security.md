# Privacy and Security Notes

This project is designed as a user-aware, consent-based device support and monitoring experience. The following principles are recommended:

- Explicit consent before linking any device
- Clear user status indicators for active sessions
- Transparent permissions for camera, microphone, and screen access
- Durable session expiration and stop controls
- Basic network retry logic with explicit reconnect status messaging
- Least-privilege access model

## Recommended constraints

- Do not hide connection steps
- Do not auto-connect without user-visible state
- Do not rely on stealth or covert background behavior
- Provide a clear device disconnect flow
- Include visible session status badges and controls

## Minimum permission expectations

- Internet access
- Background service support if needed
- Camera access (when live camera is selected)
- Microphone access (when live audio is selected)

## Recommended operational boundaries

- Session should remain active only for a user-defined or business-defined duration
- Reconnect attempts should be transparent, bounded, and visible in app state
- Log connection events only in a limited and privacy-conscious way
