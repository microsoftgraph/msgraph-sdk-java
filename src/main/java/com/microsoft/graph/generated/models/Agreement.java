package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Agreement extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Agreement} and sets the default values.
     */
    public Agreement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Agreement}
     */
    @jakarta.annotation.Nonnull
    public static Agreement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Agreement();
    }
    /**
     * Gets the acceptances property value. Read-only. Information about acceptances of this agreement.
     * @return a {@link java.util.List<AgreementAcceptance>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AgreementAcceptance> getAcceptances() {
        return this.backingStore.get("acceptances");
    }
    /**
     * Gets the displayName property value. Display name of the agreement. The display name is used for internal tracking of the agreement but isn&apos;t shown to end users who view the agreement. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("acceptances", (n) -> { this.setAcceptances(n.getCollectionOfObjectValues(AgreementAcceptance::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("file", (n) -> { this.setFile(n.getObjectValue(AgreementFile::createFromDiscriminatorValue)); });
        deserializerMap.put("files", (n) -> { this.setFiles(n.getCollectionOfObjectValues(AgreementFileLocalization::createFromDiscriminatorValue)); });
        deserializerMap.put("isPerDeviceAcceptanceRequired", (n) -> { this.setIsPerDeviceAcceptanceRequired(n.getBooleanValue()); });
        deserializerMap.put("isViewingBeforeAcceptanceRequired", (n) -> { this.setIsViewingBeforeAcceptanceRequired(n.getBooleanValue()); });
        deserializerMap.put("termsExpiration", (n) -> { this.setTermsExpiration(n.getObjectValue(TermsExpiration::createFromDiscriminatorValue)); });
        deserializerMap.put("userReacceptRequiredFrequency", (n) -> { this.setUserReacceptRequiredFrequency(n.getPeriodAndDurationValue()); });
        return deserializerMap;
    }
    /**
     * Gets the file property value. Default PDF linked to this agreement.
     * @return a {@link AgreementFile}
     */
    @jakarta.annotation.Nullable
    public AgreementFile getFile() {
        return this.backingStore.get("file");
    }
    /**
     * Gets the files property value. PDFs linked to this agreement. This property is in the process of being deprecated. Use the  file property instead. Supports $expand.
     * @return a {@link java.util.List<AgreementFileLocalization>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AgreementFileLocalization> getFiles() {
        return this.backingStore.get("files");
    }
    /**
     * Gets the isPerDeviceAcceptanceRequired property value. Indicates whether end users are required to accept this agreement on every device that they access it from. The end user is required to register their device in Microsoft Entra ID, if they haven&apos;t already done so. Supports $filter (eq).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPerDeviceAcceptanceRequired() {
        return this.backingStore.get("isPerDeviceAcceptanceRequired");
    }
    /**
     * Gets the isViewingBeforeAcceptanceRequired property value. Indicates whether the user has to expand the agreement before accepting. Supports $filter (eq).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsViewingBeforeAcceptanceRequired() {
        return this.backingStore.get("isViewingBeforeAcceptanceRequired");
    }
    /**
     * Gets the termsExpiration property value. Expiration schedule and frequency of agreement for all users. Supports $filter (eq).
     * @return a {@link TermsExpiration}
     */
    @jakarta.annotation.Nullable
    public TermsExpiration getTermsExpiration() {
        return this.backingStore.get("termsExpiration");
    }
    /**
     * Gets the userReacceptRequiredFrequency property value. The duration after which the user must reaccept the terms of use. The value is represented in ISO 8601 format for durations. Supports $filter (eq).
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getUserReacceptRequiredFrequency() {
        return this.backingStore.get("userReacceptRequiredFrequency");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("acceptances", this.getAcceptances());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("file", this.getFile());
        writer.writeCollectionOfObjectValues("files", this.getFiles());
        writer.writeBooleanValue("isPerDeviceAcceptanceRequired", this.getIsPerDeviceAcceptanceRequired());
        writer.writeBooleanValue("isViewingBeforeAcceptanceRequired", this.getIsViewingBeforeAcceptanceRequired());
        writer.writeObjectValue("termsExpiration", this.getTermsExpiration());
        writer.writePeriodAndDurationValue("userReacceptRequiredFrequency", this.getUserReacceptRequiredFrequency());
    }
    /**
     * Sets the acceptances property value. Read-only. Information about acceptances of this agreement.
     * @param value Value to set for the acceptances property.
     */
    public void setAcceptances(@jakarta.annotation.Nullable final java.util.List<AgreementAcceptance> value) {
        this.backingStore.set("acceptances", value);
    }
    /**
     * Sets the displayName property value. Display name of the agreement. The display name is used for internal tracking of the agreement but isn&apos;t shown to end users who view the agreement. Supports $filter (eq).
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the file property value. Default PDF linked to this agreement.
     * @param value Value to set for the file property.
     */
    public void setFile(@jakarta.annotation.Nullable final AgreementFile value) {
        this.backingStore.set("file", value);
    }
    /**
     * Sets the files property value. PDFs linked to this agreement. This property is in the process of being deprecated. Use the  file property instead. Supports $expand.
     * @param value Value to set for the files property.
     */
    public void setFiles(@jakarta.annotation.Nullable final java.util.List<AgreementFileLocalization> value) {
        this.backingStore.set("files", value);
    }
    /**
     * Sets the isPerDeviceAcceptanceRequired property value. Indicates whether end users are required to accept this agreement on every device that they access it from. The end user is required to register their device in Microsoft Entra ID, if they haven&apos;t already done so. Supports $filter (eq).
     * @param value Value to set for the isPerDeviceAcceptanceRequired property.
     */
    public void setIsPerDeviceAcceptanceRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isPerDeviceAcceptanceRequired", value);
    }
    /**
     * Sets the isViewingBeforeAcceptanceRequired property value. Indicates whether the user has to expand the agreement before accepting. Supports $filter (eq).
     * @param value Value to set for the isViewingBeforeAcceptanceRequired property.
     */
    public void setIsViewingBeforeAcceptanceRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isViewingBeforeAcceptanceRequired", value);
    }
    /**
     * Sets the termsExpiration property value. Expiration schedule and frequency of agreement for all users. Supports $filter (eq).
     * @param value Value to set for the termsExpiration property.
     */
    public void setTermsExpiration(@jakarta.annotation.Nullable final TermsExpiration value) {
        this.backingStore.set("termsExpiration", value);
    }
    /**
     * Sets the userReacceptRequiredFrequency property value. The duration after which the user must reaccept the terms of use. The value is represented in ISO 8601 format for durations. Supports $filter (eq).
     * @param value Value to set for the userReacceptRequiredFrequency property.
     */
    public void setUserReacceptRequiredFrequency(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("userReacceptRequiredFrequency", value);
    }
}
