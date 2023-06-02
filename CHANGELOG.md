# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added

### Changed

## [5.59.0] - 2023-05-26

### Added 

- AttributeType model and derived types and requests.
- Filter model and derived types and requests.
- Synchronization model and derived types and requests.  
- DirectoryDefinition models and related requests.
- CollapseProperty model. 
- ContainerFilter model. 
- EntryExportStatus model.   
- EntrySyncOperation model. 
- EscrowBehavior model. 
- ExpressionInputObject model. 
- Mutability model. 
- ObjectDefinition models. 
- ObjectFlowTypes model. 
- ObjectMapping models. 
- OnlineMeeting models. 
- ParseExpressionResponse model. 
- PublicErrorResponse model. 
- QuarantineReason model. 
- ReferencedObject model. 
- ScopeOperator models. 
- StringKey models.  

## [5.58.0] - 2023-05-19

### Added 

- OnlineMeetingGetVirtualAppointmentJoinWebUrl model and related requests. 
- SiteGetAllSites model and related requests. 
- The following models and requests have been added to the externalConnectors namespace: 
- ExternalActivity models and related requests. 
- ExternalItemAddActivities models and related requests. 
- IdentityReference and IdentityWithReference requests. 

## [5.57.0] - 2023-05-12

### Added 

- CrossTenantUserSyncInbound model.
- CrossTenantIdentitySyncPolicyPartner model and related requests. 
- The following models have been added to the externalConnectors namespace: 
- ActivitySettings 
- DisplayTemplate 
- ItemIdResolver 
- PropertyRule 
- RuleOperation 
- SearchSettings 
- UrlMatchInfo
- UrlToItemResolverBase. 

## [5.56.0] - 2023-05-03

### Added 

- InboundOutboundPolicyConfiguration model. 

### Removed

- CertificateBasedAuthConfiguration requests via reference removed.  

## [5.55.0] - 2023-04-27

### Added

- AllowedValue model and related requests.
- AttributeSet model and related requests. 
- CustomSecurityAttributeDefinition model and related requests. 
- ReportRootGetTeamsTeam derived models and related requests. 

## [5.54.0] - 2023-04-20

### Added

- AuthenticationCombinationConfiguration model and requests.
- AuthenticationMethodMode derived models and requests. 
- AuthenticationStrengthPolicy derived models and requests.

## [5.53.0] - 2023-04-11

### Added

- Added BrowserSharedCookie model and derived type instances/requests.  
- Added BrowserSites model and derived type instances/requests.

## [5.52.0] - 2023-04-04

### Added

- Added triggerTypes to security.
- Added resourceNamespaces to RbacApplication.

## [5.51.0] - 2023-03-28

### Added

- Adds AuthenticationMethodConfiguration derived types instances
- Added AuthenticationMethodsPolicyMigrationState

## [5.50.0] - 2023-03-21

### Added

- Added members of type cast segment to administative units.

## [5.49.0] - 2023-03-14

### Added

- Added conditional access external tenants and guests.
- Added learning experience/content/provider.

## [5.48.0] - 2023-03-08

### Added

- Adds delta function to DirectoryObject collection types
- Access Management Policy  

### Changed

- Fixed invalid odata casts for memberOf and transitiveMemberOf methods

## [5.47.0] - 2023-02-14

### Added

- Access package questions/management/collections/policy.
- SharePoint/OneDrive options.

## [5.46.0] - 2023-02-07

### Added

- Tenant relationship.
- Delegated Admin Access Assignment.

## [5.45.0] - 2023-01-24

### Added

- defaultUsageLocation property in Organization.
- teamsAppId in ChatMessageAttachment.

### Changed

- Removed workbook items at the root which was not supported by the service.

## [5.44.0] - 2023-01-17

### Added

- Ios minimum operating system version 15.
- Contained apps on mobile app content.
- Include company portal link on notification template branding options.
- JoinMeetingIdSettings on OnlineMeeting.
- PartnerTenantType on Organization.
- CommitedContainedApp on WindowsUniveralAppX
- DevicesWithoutCompliancePolicyReport

## [5.43.0] - 2022-12-16

### Added

- CrossCloudAzureActiveDirectoryTenant model. 
- DomainPromote models and related requests.
- RiskyServicePrincipal models and related requests. 
- SecurityRunHunting models and related requests. 
- ServicePrincipalRiskDetection model and related requests. 
- Security Namespace Additions:  
- DefenderAvStatus model. 
- DetectionSource model. 
- DetectionStatus model.  
- DeviceHealthStatus model. 
- DeviceRiskScore model. 
- EmailSender model. 
- EvidenceRemediationStatus model. 
- EvidenceRole model. 
- EvidenceVerdict model.
- (Entity)Evidence models.
- FileDetails model. 
- HuntingQueryResults model. 
- HuntingRowResult model. 
- LoggedOnUser model. 
- OnboardingStatus model.
- ServiceSource model. 
- SinglePropertySchema model. 
- UserAccount model. 
- VmCloudProvider model. 
- VmMetadata model.
- Alert models and related requests.
- Incident models and related requests. 
 
### Changed

- Generated v1.0 models and request builders using Typewriter.
- Classes related to the removed and added models/requests have been updated to reflect the addition and removal of these models/requests.

## [5.42.0] - 2022-12-07

### Added

- AnonymousGuestConversationMember model and related requests. 
- MicrosoftAccountUserConversationMember model and related requests. 
- SkypeForBusinessUserConversationMember model and related requests. 
- SkypeUserConversationMember model and related requests. 
- Security Namespace Additions: 
- EdiscoveryPurgeDataOperation model and related requests.
- EdiscoverySearchPurgeData model and related requests. 
- PurgeAreas model. 
- PurgeType model.  
 
### Changed

- Generated v1.0 models and request builders using Typewriter.
- Classes related to the removed and added models/requests have been updated to reflect the addition and removal of these models/requests.

## [5.41.0] - 2022-11-09

### Added

- AuditActor model.
- AuditProperty model. 
- AuditResource model. 
- ChannelMembersNotificationRecipient model. 
- ChatMembersNotificationRecipient model. 
- MacOSLobChildApp model. 
- MacOSMinimumOperatingSystem model. 
- MicrosoftEdgeChannel model. 
- TeamMembersNotificationRecipient model. 
- AuditEvent models and related requests. 
- DeviceManagementPartnerTerminate models and related requests. 
- EducationAssignmentSetUpFeedbackResourcesFolder models and related requests. 
- EducationFeedbackResourceOutcome models and related requests. 
- MacOSLobApp models and related requests. 
- MacOSMicrosoftEdgeApp model and related requests. 
 
### Changed

- Generated v1.0 models and request builders using Typewriter.
- Classes related to the removed and added models/requests have been updated to reflect the addition and removal of these models/requests.
- Remove withRequireChangeOnNextSignIn from AuthenticationMethodResetPasswordParameterSet as this only applied for certain first party apps and shouldn't have been added prior.  

## [5.40.0] - 2022-11-03

### Added
 
### Changed

- Generated v1.0 models and request builders using Typewriter.
- Models and Requests returning or consuming a 'Report' model have been changed to return or cosume a java.io.InputStream. 
- Fixed case where some intances of functionOptions were not being added to request options. 
- Fixed case where in some instances parameters weren't being added to request body. 

## [5.39.0] - 2022-10-20

### Added

- AuthenticationMethodFeatureConfiguration model. 
- ChatViewpoint model. 
- ConditionalAccessPolicyDetail model. 
- FeatureTarget models. 
- MicrosoftAuthenticatorFeatureSettings model. 
- TemplateScenarios model. 
- ChatHideForUser models and related requests. 
- ChatMarkChatReadForUser models and related requests. 
- ChatMarkChatUnreadForUser models and related requests. 
- ChatMessageInfo model and related requests. 
- ChatUnhideForUser models and related requests. 
- ConditionalAccessTemplate model and related requests. 

### Changed

- Generated v1.0 models and request builders using Typewriter.
- Classes related to the removed and added models/requests have been updated to reflect the addition and removal of these models/requests.
- Bumped Microsoft-Graph-Core to 2.0.14

## [5.38.0] - 2022-10-12

### Added

- AssignedTrainingInfo model. 
- AttackSimulationRepeatOffender model. 
- AttackSimulationSimulationUserCoverage model. 
- AttackSimulationTrainingUserCoverage model. 
- AttackSimulationUser model. 
- EmailIdentity model. 
- PayloadDeliveryPlatform model. 
- RecommendedAction model. 
- TrainingEventsContent model. 
- TrainingStatus model. 
- AccessPackageAssignmentAdditionalAccess models and related requests. 
- AttackSimulationRoot model and related requests. 
- AuthenticationContextClassReference model and related requests. 
- ReportRootGetM365App models and related requests. 
- SecurityReportsRoot models and related requests. 
- Simulation models and related requests. 
- TeamworkSendActivityNotificationToRecipients models and related requests. 

### Changed

- Generated v1.0 models and request builders using Typewriter.
- Classes related to the removed and added models/requests have been updated to reflect the addition and removal of these models/requests.

## [5.37.0] - 2022-09-28

### Added

- AuthorizationInfo model. 
- BroadcastMeetingCaptionSettings model. 
- AddLargeGalleryViewOperation model and related requests. 
- CallAddLargeGalleryView models and related requests. 
- TeamworkTag models and related requests. 

### Changed

- Generated v1.0 models and request builders using Typewriter.
- Classes related to the removed and added models/requests have been updated to reflect the addition and removal of these models/requests.

## [5.36.0] - 2022-09-22

### Added

- MessagePinnedEventMessageDetail model. 
- MessageUnpinnedEventMessageDetail model. 
- RedirectUriSettings model. 
- X509Certificate models. 
- ContentSharingSession model and related requests. 
- PinnedChatMessageInfo model and related requests. 
- X509CertificateAuthentication models and related requests. 
- ChatMessageReference requests. 
- ChatMessageWithReference requests.

### Changed

- Generated v1.0 models and request builders using Typewriter.
- Classes related to the removed and added models/requests have been updated to reflect the addition and removal of these models/requests.
- Removed RestrictedSignIn models and related requests. 

## [5.35.0] - 2022-09-15

### Added

- MessagePinnedEventMessageDetail model. 
- MessageUnpinnedEventMessageDetail model. 
- RedirectUriSettings model. 
- PinnedChatMessageInfo model and related requests. 
- ChatMessageReference requests. 

### Changed

- Generated v1.0 models and request builders using Typewriter.
- Classes related to the removed and added models/requests have been updated to reflect the addition and removal of these models/requests. 
- Removed RestrictedSignIn model and related requets. 

## [5.34.0] - 2022-09-01

### Added

- AutoRestartNotificationDismissalMethod model. 
- DetectedAppPlatformType model. 
- WindowsUpdateForBusinessUpdateWeeks model. 
- WindowsUpdateNotificationDisplayOption model. 
- PresenceClearUserPreferredPresence models and related requests. 
- PresenceSetUserPreferredPresence models and related requests.

### Changed

- Generated v1.0 models and request builders using Typewriter.
- References to newly added models/requests added to current models/requests.
- Example: WindowsUpdateForBusinessConfiguration model references newly added WindowsUpdate models and requests.
- Example: PresenceRequestBuilder request references newly added PresenceClearUserPreferredPresence & PresenceSetUserPreferredPresence models/requests. 

## [5.33.0] - 2022-08-23

### Added

### Changed

- Generated v1.0 models and request builders using Typewriter.
- VerifiedPublisher property added to ServicePrincipal model. 

## [5.32.0] - 2022-08-11

### Added

- AttachmentInfo model. 
- DeviceDeltaParameterSet models.
- DeviceManagementReportsGetNoncompliantDevicesAndSettingsReportParameterSet models.  
- DiskType model. 
- SignInFrequencyAuthenticationType model.
- SignInFrequencyInterval model. 
- DocumentSetVersionRestoreParameterSet models. 
- UserExperienceAnalyticsHealthState model. 
- AttachmentBase models and related requests.
- AttachmentSession model and related requests.
- DocumentSetVersion models and related requests. 
- TaskFileAttachment model and related requests. 
- UserExperienceAnalyticsDevicePerformance model and related requests. 

### Changed

- Generated v1.0 models and request builders using Typewriter.
- References to newly added models/requests added to current models/requests.

## [5.31.0] - 2022-07-21

### Added

- AccessPackageAutomaticRequestSettings model. 
- AttributeRuleMembers model. 
- AuthenticationMethodSignInState model. 
- AuthenticationPhoneType model. 
- AvailabilityItem model. 
- BookingsAvailabilityStatus model. 
- StaffAvailabilityItem model. 
- BookingBusinessGetStaffAvailability models and related requests.
- EmailAuthenticationMethod model and related requests.  
- PhoneAuthenticationMethod models and related requests. 
- SoftwareOathAuthenticationMethod model and related requests. 

### Changed

- Generated v1.0 models and request builders using Typewriter.
- References to newly added models/requests added to current models/requests.
- Example: Authentication model now has refrences to EmailAuthenticationMethod, PhoneAuthenticationMethod, SoftwareOathAuthenticationMethod models. 
- Example: AuthenticationRequestBuilder now references EmailAuthenticationMethodRequestBuilder, PhoneAuthenticationMethodRequestBuilder, and SoftwareOathAuthenticationMethodRequestBuilder. 

## [5.30.0] - 2022-07-05

### Added

- Added new authentication methods.
- Added password reset operation.
- Added cross tenant policies and federated identity.
- Added E-discovery cases and a large set of associated types.
- Added summary to Team.

## [5.29.0] - 2022-06-29

### Added

### Changed

- Generated v1.0 models and request builders using Typewriter.
- Emun values added to TeamsAsyncOperationType.

## [5.28.0] - 2022-06-21

### Added

- AssociatedTeamInfo model and related requests. 
- ChannelDoesUserHaveAccessParameterSet models and related requets.
- SharedWithChannelTeamInfo model and related requests. 
- TeamInfo model and related requests. 
- ConversationMember requests. 
- ChannelCollection and ChannelReference requests. 

### Changed

- Generated v1.0 models and request builders using Typewriter.
- Updated the classes with references to the newly added models and requests, ie. UserTeamwork.class, Team.class, Channel.class, etc.

## [5.27.0] - 2022-06-15

### Added

- Certification model. 

### Changed

- Generated v1.0 models and request builders using Typewriter.
- Added Certification to Application model. 

## [5.26.0] - 2022-06-07

### Added

- AudioCodec model.
- NetworkTransportProtocol model.
- TraceRouteHop model. 
- VideoCodec model. 
- AccessReview models and related requests. 
- TemporaryAccessPassAuthenticationMethod models and related requests. 

### Changed

- Generated v1.0 models and request builders using Typewriter.
- Models and requests related to the newly added AccessReview models. 
- Models and requests related to TemporaryAccessPassAuthenticationMethod. 

## [5.25.0] - 2022-05-19

### Added

- ChecklistItem model and related requests. 

### Changed

- Generated v1.0 models and request builders using Typewriter.
- Model and requests related to the added CheckListItem model, ie: TodoTask & TodoTaskRequestBuilder. 

## [5.24.0] - 2022-05-11

### Added

- AuthenticationProtocol model.
- FederatedIdpMfaBehavior model.
- PromptLoginBehavior model.  
- SigningCertificateUpdateStatus model. 
- EducationAssignmentDeltaParameterSet models and related requests. 
- EducationCategoryDeltaParameterSet models and related requests.
- ExternalDomainName model and related requests. 
- InternalDomainFederation model and related requests. 
- SamlOrWsFedExternalDomainFederation model and related requests. 
- SamlOrWsFedProvider model and related requests. 

### Changed

- Generated v1.0 models and request builders using Typewriter.
- Added refrences to the added models in related models and requests. 

## [5.23.0] - 2022-05-06

### Added

- ContentTypeAddCopyFromContentTypeHubParameterSet models and related requests.  
- ContentTypeGetCompatibleHubContentTypesParameterSet models and related requests.   
- LongRunningOperation model and related requests.
- LongRunningOperationStatus model and related requests.
- RichLongRunningOperation model and related requests. 

### Changed

- Generated v1.0 models and request builders using Typewriter.
- Added refrences to the added models in related models and requests. 

## [5.22.0] - 2022-04-28

### Added

- PlannerContainerType model.
- PlannerPlanContainer model. 

### Changed

- Generated v1.0 models and request builders using Typewriter.
- PlannerCategroyDescriptions model. 
- PlannerTask model. 
- TeamworkUserIdentityType model. 

## [5.21.0] - 2022-04-22

### Added

### Changed

- Bump dependency on Graph-Core to 2.0.12 

## [5.20.0] - 2022-04-12

### Added

- ApprovalSettings model.
- RequestSchedule model.
- TicketInfo model.
- UnifiedApprovalStage model. 
- UnifiedRoleScheduleRequestActions model. 
- AppScopeReference and AppScopeWithReference requests.  
- RoleAssignmentSchedule models and related requests. 
- RoleEligibilitySchedule models and related requests. 
- UnifiedRoleAssignmentSchedule models and related requests. 
- UnifiedRoleEligibilitySchedule models and related requests. 
- UnifiedRoleManagementPolicy models and related requests. 
- UnifiedRoleSchedule models and related requests.  

### Changed

- Generated v1.0 models and request builders using Typewriter.
- PolicyRoot model and request builder.  
- RbacApplication model and request builder.  

## [5.19.0] - 2022-04-05

### Added

- AccessPackageAssignmentRequestReprocessParameterSet model and related requests.
- AccessPackageAssignmentReprocessParameterSet model and related requests. 

### Changed

- Generated v1.0 models and request builders using Typewriter.
- AccessPackageAssignmentRequestBuilder & AccessPackageAssignmentRequestRequestBuilder requests. 
- User model. 

## [5.18.0] - 2022-03-30

### Added

- ConditionalAccessClientApplications model removed.

### Changed

- Generated v1.0 models and request builders using Typewriter.
- ColumnDefinition, ConditionalAccessConditionSet, & ConditionalAccessDevicePlatform models changed.  

## [5.17.0] - 2022-03-17

### Added

- AccessPackageApprovalStage, TargetApplicationOwners, AllowedTargetScope, & TargetManager models.
- AccessPackageAssignment(AprovalSettings, Policy, ReviewSettings, and etc) models.
- AccessPackageAssignment related requests. 

### Changed

- Generated v1.0 models and request builders using Typewriter.
- Dependencies in AccessPackageAssignment and it's related classes. 
- Dependencies in EntitlementManagement and it's request builder. 

## [5.16.0] - 2022-03-10

### Added

- ResourceSpecificPermission and SubscriptionReauthorizeParameterSet models
- SubscriptionReauthorizeParameterSet related requests.

### Changed

- Generated v1.0 models and request builders using Typewriter.
- ServicePrincipal model.
- SubscriptionRequestBuilder request.

## [5.15.0] - 2022-02-24

### Added

- UserPurpose model.  

### Changed

- Generated v1.0 models and request builders using Typewriter.
 
## [5.14.0] - 2022-02-10

### Added

- AccessReviewHistory(DecisionFilter, Definition, Instance, and etc) models
- AccessReviewHistory(DecisionFilter, Definition, Instance, and etc) requests and requestBuilders.   
- Dictionary, IncomingCallOptions, ResultTemplate(Dictionary/Option), and SearchAlteration(Options/Type) models. 

### Changed

- Generated v1.0 models and request builders using Typewriter.
- SearchHit, SearchResponse, and SearchRequest models. 
- AccessReviewSet, CallAnswerParameterSet, Chat models. 


## [5.13.0] - 2022-01-27

### Added

### Changed

- Generated v1.0 models and request builders using Typewriter.
- DriveItemCreateLinkParameterSet model and builder-model. 
- DriveItemInviteParameterSe model and builder-model.

## [5.12.0] - 2022-01-20

### Added

- ServiceAnnouncementAttachment Model
- Requests related to ServiceAnnouncementAttachment

### Changed

- Generated v1.0 models and request builders using Typewriter.

## [5.11.0] - 2022-01-11

### Added

- Models and Request classes related to RiskDetection and RiskyUser. 

### Changed

- Generated v1.0 models and request builders using Typewriter.

## [5.10.0] - 2022-01-05

### Added

- Plenty of Models relating to Education and Booking added in this update. 

### Changed

- Generated v1.0 models and request builders using Typewriter 
- First Update of 2022! 

## [5.9.0] - 2021-12-15

### Added

### Changed

- Generated v1.0 models and request builders using Typewriter

## [5.8.0] - 2021-11-19

### Added

### Changed

- Generated v1.0 models and request builders using Typewriter
- Removed classes pertaining to eDiscovery as they were included prematurley. The API is not functional yet and will be added at a later time. 
- Report API was broken, methods returning a report now return a java.io.InputStream. 

## [5.7.0] - 2021-11-09

### Added

### Changed

- Generated v1.0 models and request builders using Typewriter

## [5.6.0] - 2021-10-27

### Added

### Changed

- Generated v1.0 models and request builders using Typewriter
- Correcting enum mistake in ManagementAgentType. 

## [5.5.0] - 2021-10-14

### Added

### Changed

- Generated v1.0 models and request builders using Typewriter
- Hotfix: Android_Work_Profile changed to Android_For_Work in PolicyPlatformType.java

## [5.4.0] - 2021-09-24

### Added

### Changed

- Generated v1.0 models and request builders using Typewriter

## [5.3.0] - 2021-09-17

### Added

### Changed

- Generated v1.0 models and request builders using Typewriter 


## [5.2.0] - 2021-09-17

### Added

- Initial GitHub Release using Actions

### Changed

- Migrated from ADO pipeline to GitHub Actions

