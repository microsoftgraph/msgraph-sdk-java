package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for prompting user for samples submission.
 */
public enum DefenderPromptForSampleSubmission implements ValuedEnum {
    /** User Defined, default value, no intent. */
    UserDefined("userDefined"),
    /** Always prompt. */
    AlwaysPrompt("alwaysPrompt"),
    /** Send safe samples automatically. */
    PromptBeforeSendingPersonalData("promptBeforeSendingPersonalData"),
    /** Never send data. */
    NeverSendData("neverSendData"),
    /** Send all data without prompting. */
    SendAllDataWithoutPrompting("sendAllDataWithoutPrompting");
    public final String value;
    DefenderPromptForSampleSubmission(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DefenderPromptForSampleSubmission forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "alwaysPrompt": return AlwaysPrompt;
            case "promptBeforeSendingPersonalData": return PromptBeforeSendingPersonalData;
            case "neverSendData": return NeverSendData;
            case "sendAllDataWithoutPrompting": return SendAllDataWithoutPrompting;
            default: return null;
        }
    }
}
