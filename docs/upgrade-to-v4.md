# Microsoft Graph Java SDK v4 changelog and upgrade guide

Welcome to the Microsoft Graph Java SDK migration guide to v4. The purpose of this document is to list out any breaking change and migration work SDK users might run into while upgrading to the latest version of the SDK.

## Upgrade guide for breaking changes

### IdentitySet replaced by specialized types for Microsoft Teams APIs

The `IdentitySet` type has been replaced by specialized types inheriting from it and exposing more information for the Microsoft Teams APIs.

- The `ChatMessage.from` property is now of type `ChatMessageFromIdentitySet`
- The `ChatMessageMention.mentioned` property is now of type `ChatMessageMentionedIdentitySet`
- The `ChatMessageReaction.user` property is now of type `ChatMessageReactionIdentitySet`

If your application is reading/assigning the above-mentioned properties, you need to update the code to reference these new types instead. If your application was using the `additionalData` property to read any property that is now available on the new types, update the code to use these new properties instead.
