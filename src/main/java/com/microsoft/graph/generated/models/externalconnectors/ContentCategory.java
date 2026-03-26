package com.microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ContentCategory implements ValuedEnum {
    Uncategorized("uncategorized"),
    KnowledgeBase("knowledgeBase"),
    Wikis("wikis"),
    FileRepository("fileRepository"),
    Qna("qna"),
    Crm("crm"),
    Dashboard("dashboard"),
    People("people"),
    Media("media"),
    Email("email"),
    Messaging("messaging"),
    MeetingTranscripts("meetingTranscripts"),
    TaskManagement("taskManagement"),
    LearningManagement("learningManagement"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ContentCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ContentCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "uncategorized": return Uncategorized;
            case "knowledgeBase": return KnowledgeBase;
            case "wikis": return Wikis;
            case "fileRepository": return FileRepository;
            case "qna": return Qna;
            case "crm": return Crm;
            case "dashboard": return Dashboard;
            case "people": return People;
            case "media": return Media;
            case "email": return Email;
            case "messaging": return Messaging;
            case "meetingTranscripts": return MeetingTranscripts;
            case "taskManagement": return TaskManagement;
            case "learningManagement": return LearningManagement;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
