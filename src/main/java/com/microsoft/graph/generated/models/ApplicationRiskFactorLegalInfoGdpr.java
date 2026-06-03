package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApplicationRiskFactorLegalInfoGdpr implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ApplicationRiskFactorLegalInfoGdpr} and sets the default values.
     */
    public ApplicationRiskFactorLegalInfoGdpr() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApplicationRiskFactorLegalInfoGdpr}
     */
    @jakarta.annotation.Nonnull
    public static ApplicationRiskFactorLegalInfoGdpr createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplicationRiskFactorLegalInfoGdpr();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the dataProtection property value. The dataProtection property
     * @return a {@link EnumSet<DataProtection>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<DataProtection> getDataProtection() {
        return this.backingStore.get("dataProtection");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("dataProtection", (n) -> { this.setDataProtection(n.getEnumSetValue(DataProtection::forValue)); });
        deserializerMap.put("hasRightToErasure", (n) -> { this.setHasRightToErasure(n.getBooleanValue()); });
        deserializerMap.put("isReportingDataBreaches", (n) -> { this.setIsReportingDataBreaches(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("statementUrl", (n) -> { this.setStatementUrl(n.getStringValue()); });
        deserializerMap.put("userOwnership", (n) -> { this.setUserOwnership(n.getEnumSetValue(UserOwnership::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hasRightToErasure property value. Indicates whether the application provides users with the ability to request deletion of their personal data (the right to be forgotten).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasRightToErasure() {
        return this.backingStore.get("hasRightToErasure");
    }
    /**
     * Gets the isReportingDataBreaches property value. Indicates whether the organization reports personal data breaches to authorities and affected users in accordance with GDPR requirements.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsReportingDataBreaches() {
        return this.backingStore.get("isReportingDataBreaches");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the statementUrl property value. Specifies the URL of the application&apos;s GDPR or privacy compliance statement, outlining how user data is handled.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatementUrl() {
        return this.backingStore.get("statementUrl");
    }
    /**
     * Gets the userOwnership property value. The userOwnership property
     * @return a {@link EnumSet<UserOwnership>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<UserOwnership> getUserOwnership() {
        return this.backingStore.get("userOwnership");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumSetValue("dataProtection", this.getDataProtection());
        writer.writeBooleanValue("hasRightToErasure", this.getHasRightToErasure());
        writer.writeBooleanValue("isReportingDataBreaches", this.getIsReportingDataBreaches());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("statementUrl", this.getStatementUrl());
        writer.writeEnumSetValue("userOwnership", this.getUserOwnership());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the dataProtection property value. The dataProtection property
     * @param value Value to set for the dataProtection property.
     */
    public void setDataProtection(@jakarta.annotation.Nullable final EnumSet<DataProtection> value) {
        this.backingStore.set("dataProtection", value);
    }
    /**
     * Sets the hasRightToErasure property value. Indicates whether the application provides users with the ability to request deletion of their personal data (the right to be forgotten).
     * @param value Value to set for the hasRightToErasure property.
     */
    public void setHasRightToErasure(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasRightToErasure", value);
    }
    /**
     * Sets the isReportingDataBreaches property value. Indicates whether the organization reports personal data breaches to authorities and affected users in accordance with GDPR requirements.
     * @param value Value to set for the isReportingDataBreaches property.
     */
    public void setIsReportingDataBreaches(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isReportingDataBreaches", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the statementUrl property value. Specifies the URL of the application&apos;s GDPR or privacy compliance statement, outlining how user data is handled.
     * @param value Value to set for the statementUrl property.
     */
    public void setStatementUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("statementUrl", value);
    }
    /**
     * Sets the userOwnership property value. The userOwnership property
     * @param value Value to set for the userOwnership property.
     */
    public void setUserOwnership(@jakarta.annotation.Nullable final EnumSet<UserOwnership> value) {
        this.backingStore.set("userOwnership", value);
    }
}
