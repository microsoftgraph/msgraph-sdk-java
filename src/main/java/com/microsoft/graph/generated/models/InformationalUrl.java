package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InformationalUrl implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link InformationalUrl} and sets the default values.
     */
    public InformationalUrl() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InformationalUrl}
     */
    @jakarta.annotation.Nonnull
    public static InformationalUrl createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InformationalUrl();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("logoUrl", (n) -> { this.setLogoUrl(n.getStringValue()); });
        deserializerMap.put("marketingUrl", (n) -> { this.setMarketingUrl(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("privacyStatementUrl", (n) -> { this.setPrivacyStatementUrl(n.getStringValue()); });
        deserializerMap.put("supportUrl", (n) -> { this.setSupportUrl(n.getStringValue()); });
        deserializerMap.put("termsOfServiceUrl", (n) -> { this.setTermsOfServiceUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the logoUrl property value. CDN URL to the application's logo, Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLogoUrl() {
        return this.backingStore.get("logoUrl");
    }
    /**
     * Gets the marketingUrl property value. Link to the application's marketing page. For example, https://www.contoso.com/app/marketing
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMarketingUrl() {
        return this.backingStore.get("marketingUrl");
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
     * Gets the privacyStatementUrl property value. Link to the application's privacy statement. For example, https://www.contoso.com/app/privacy
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrivacyStatementUrl() {
        return this.backingStore.get("privacyStatementUrl");
    }
    /**
     * Gets the supportUrl property value. Link to the application's support page. For example, https://www.contoso.com/app/support
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSupportUrl() {
        return this.backingStore.get("supportUrl");
    }
    /**
     * Gets the termsOfServiceUrl property value. Link to the application's terms of service statement. For example, https://www.contoso.com/app/termsofservice
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTermsOfServiceUrl() {
        return this.backingStore.get("termsOfServiceUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("logoUrl", this.getLogoUrl());
        writer.writeStringValue("marketingUrl", this.getMarketingUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("privacyStatementUrl", this.getPrivacyStatementUrl());
        writer.writeStringValue("supportUrl", this.getSupportUrl());
        writer.writeStringValue("termsOfServiceUrl", this.getTermsOfServiceUrl());
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
     * Sets the logoUrl property value. CDN URL to the application's logo, Read-only.
     * @param value Value to set for the logoUrl property.
     */
    public void setLogoUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("logoUrl", value);
    }
    /**
     * Sets the marketingUrl property value. Link to the application's marketing page. For example, https://www.contoso.com/app/marketing
     * @param value Value to set for the marketingUrl property.
     */
    public void setMarketingUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("marketingUrl", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the privacyStatementUrl property value. Link to the application's privacy statement. For example, https://www.contoso.com/app/privacy
     * @param value Value to set for the privacyStatementUrl property.
     */
    public void setPrivacyStatementUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("privacyStatementUrl", value);
    }
    /**
     * Sets the supportUrl property value. Link to the application's support page. For example, https://www.contoso.com/app/support
     * @param value Value to set for the supportUrl property.
     */
    public void setSupportUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("supportUrl", value);
    }
    /**
     * Sets the termsOfServiceUrl property value. Link to the application's terms of service statement. For example, https://www.contoso.com/app/termsofservice
     * @param value Value to set for the termsOfServiceUrl property.
     */
    public void setTermsOfServiceUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("termsOfServiceUrl", value);
    }
}
