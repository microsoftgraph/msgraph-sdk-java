# Microsoft Graph Java SDK v5 changelog and upgrade guide

Welcome to the Microsoft Graph Java SDK migration guide to v5. The purpose of this document is to list out any breaking change and migration work SDK users might run into while upgrading to the latest version of the SDK.

## Upgrade guide for breaking changes

### ManagedAppProtection replaced by TargetedManagedAppProtection for some Security APIs

The `ManagedAppProtection` type used for the `targetApps` action as a parameter has been replaced by a new `TargetedManagedAppProtection` type that inherits from it and exposes new properties.

If your application is using the above-mentioned type, you need to update the code to reference the new type instead. If your application was using the `additionalData` property to read any property that is now available on the new type, update the code to use these new properties instead.
