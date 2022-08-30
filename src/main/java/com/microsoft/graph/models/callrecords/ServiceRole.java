package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the cloudCommunications singleton. */
public enum ServiceRole implements ValuedEnum {
    Unknown("unknown"),
    CustomBot("customBot"),
    SkypeForBusinessMicrosoftTeamsGateway("skypeForBusinessMicrosoftTeamsGateway"),
    SkypeForBusinessAudioVideoMcu("skypeForBusinessAudioVideoMcu"),
    SkypeForBusinessApplicationSharingMcu("skypeForBusinessApplicationSharingMcu"),
    SkypeForBusinessCallQueues("skypeForBusinessCallQueues"),
    SkypeForBusinessAutoAttendant("skypeForBusinessAutoAttendant"),
    MediationServer("mediationServer"),
    MediationServerCloudConnectorEdition("mediationServerCloudConnectorEdition"),
    ExchangeUnifiedMessagingService("exchangeUnifiedMessagingService"),
    MediaController("mediaController"),
    ConferencingAnnouncementService("conferencingAnnouncementService"),
    ConferencingAttendant("conferencingAttendant"),
    AudioTeleconferencerController("audioTeleconferencerController"),
    SkypeForBusinessUnifiedCommunicationApplicationPlatform("skypeForBusinessUnifiedCommunicationApplicationPlatform"),
    ResponseGroupServiceAnnouncementService("responseGroupServiceAnnouncementService"),
    Gateway("gateway"),
    SkypeTranslator("skypeTranslator"),
    SkypeForBusinessAttendant("skypeForBusinessAttendant"),
    ResponseGroupService("responseGroupService"),
    Voicemail("voicemail"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ServiceRole(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceRole forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "customBot": return CustomBot;
            case "skypeForBusinessMicrosoftTeamsGateway": return SkypeForBusinessMicrosoftTeamsGateway;
            case "skypeForBusinessAudioVideoMcu": return SkypeForBusinessAudioVideoMcu;
            case "skypeForBusinessApplicationSharingMcu": return SkypeForBusinessApplicationSharingMcu;
            case "skypeForBusinessCallQueues": return SkypeForBusinessCallQueues;
            case "skypeForBusinessAutoAttendant": return SkypeForBusinessAutoAttendant;
            case "mediationServer": return MediationServer;
            case "mediationServerCloudConnectorEdition": return MediationServerCloudConnectorEdition;
            case "exchangeUnifiedMessagingService": return ExchangeUnifiedMessagingService;
            case "mediaController": return MediaController;
            case "conferencingAnnouncementService": return ConferencingAnnouncementService;
            case "conferencingAttendant": return ConferencingAttendant;
            case "audioTeleconferencerController": return AudioTeleconferencerController;
            case "skypeForBusinessUnifiedCommunicationApplicationPlatform": return SkypeForBusinessUnifiedCommunicationApplicationPlatform;
            case "responseGroupServiceAnnouncementService": return ResponseGroupServiceAnnouncementService;
            case "gateway": return Gateway;
            case "skypeTranslator": return SkypeTranslator;
            case "skypeForBusinessAttendant": return SkypeForBusinessAttendant;
            case "responseGroupService": return ResponseGroupService;
            case "voicemail": return Voicemail;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
