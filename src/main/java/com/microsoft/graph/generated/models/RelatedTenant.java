package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RelatedTenant extends Entity implements Parsable {
    /**
     * Instantiates a new {@link RelatedTenant} and sets the default values.
     */
    public RelatedTenant() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RelatedTenant}
     */
    @jakarta.annotation.Nonnull
    public static RelatedTenant createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RelatedTenant();
    }
    /**
     * Gets the appB2BSignInActivityMetrics property value. The appB2BSignInActivityMetrics property
     * @return a {@link B2BSignInActivityMetrics}
     */
    @jakarta.annotation.Nullable
    public B2BSignInActivityMetrics getAppB2BSignInActivityMetrics() {
        return this.backingStore.get("appB2BSignInActivityMetrics");
    }
    /**
     * Gets the b2BRegistrationMetrics property value. The b2BRegistrationMetrics property
     * @return a {@link B2bRegistrationMetrics}
     */
    @jakarta.annotation.Nullable
    public B2bRegistrationMetrics getB2BRegistrationMetrics() {
        return this.backingStore.get("b2BRegistrationMetrics");
    }
    /**
     * Gets the b2BSignInActivityMetrics property value. The b2BSignInActivityMetrics property
     * @return a {@link B2BSignInActivityMetrics}
     */
    @jakarta.annotation.Nullable
    public B2BSignInActivityMetrics getB2BSignInActivityMetrics() {
        return this.backingStore.get("b2BSignInActivityMetrics");
    }
    /**
     * Gets the billingMetrics property value. The billingMetrics property
     * @return a {@link BillingMetrics}
     */
    @jakarta.annotation.Nullable
    public BillingMetrics getBillingMetrics() {
        return this.backingStore.get("billingMetrics");
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appB2BSignInActivityMetrics", (n) -> { this.setAppB2BSignInActivityMetrics(n.getObjectValue(B2BSignInActivityMetrics::createFromDiscriminatorValue)); });
        deserializerMap.put("b2BRegistrationMetrics", (n) -> { this.setB2BRegistrationMetrics(n.getObjectValue(B2bRegistrationMetrics::createFromDiscriminatorValue)); });
        deserializerMap.put("b2BSignInActivityMetrics", (n) -> { this.setB2BSignInActivityMetrics(n.getObjectValue(B2BSignInActivityMetrics::createFromDiscriminatorValue)); });
        deserializerMap.put("billingMetrics", (n) -> { this.setBillingMetrics(n.getObjectValue(BillingMetrics::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("isMicrosoftInfrastructure", (n) -> { this.setIsMicrosoftInfrastructure(n.getBooleanValue()); });
        deserializerMap.put("multiTenantApplicationMetrics", (n) -> { this.setMultiTenantApplicationMetrics(n.getObjectValue(MultiTenantApplicationMetrics::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isMicrosoftInfrastructure property value. Indicates whether this tenant is a Microsoft infrastructure tenant.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMicrosoftInfrastructure() {
        return this.backingStore.get("isMicrosoftInfrastructure");
    }
    /**
     * Gets the multiTenantApplicationMetrics property value. The multiTenantApplicationMetrics property
     * @return a {@link MultiTenantApplicationMetrics}
     */
    @jakarta.annotation.Nullable
    public MultiTenantApplicationMetrics getMultiTenantApplicationMetrics() {
        return this.backingStore.get("multiTenantApplicationMetrics");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("appB2BSignInActivityMetrics", this.getAppB2BSignInActivityMetrics());
        writer.writeObjectValue("b2BRegistrationMetrics", this.getB2BRegistrationMetrics());
        writer.writeObjectValue("b2BSignInActivityMetrics", this.getB2BSignInActivityMetrics());
        writer.writeObjectValue("billingMetrics", this.getBillingMetrics());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("multiTenantApplicationMetrics", this.getMultiTenantApplicationMetrics());
    }
    /**
     * Sets the appB2BSignInActivityMetrics property value. The appB2BSignInActivityMetrics property
     * @param value Value to set for the appB2BSignInActivityMetrics property.
     */
    public void setAppB2BSignInActivityMetrics(@jakarta.annotation.Nullable final B2BSignInActivityMetrics value) {
        this.backingStore.set("appB2BSignInActivityMetrics", value);
    }
    /**
     * Sets the b2BRegistrationMetrics property value. The b2BRegistrationMetrics property
     * @param value Value to set for the b2BRegistrationMetrics property.
     */
    public void setB2BRegistrationMetrics(@jakarta.annotation.Nullable final B2bRegistrationMetrics value) {
        this.backingStore.set("b2BRegistrationMetrics", value);
    }
    /**
     * Sets the b2BSignInActivityMetrics property value. The b2BSignInActivityMetrics property
     * @param value Value to set for the b2BSignInActivityMetrics property.
     */
    public void setB2BSignInActivityMetrics(@jakarta.annotation.Nullable final B2BSignInActivityMetrics value) {
        this.backingStore.set("b2BSignInActivityMetrics", value);
    }
    /**
     * Sets the billingMetrics property value. The billingMetrics property
     * @param value Value to set for the billingMetrics property.
     */
    public void setBillingMetrics(@jakarta.annotation.Nullable final BillingMetrics value) {
        this.backingStore.set("billingMetrics", value);
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the isMicrosoftInfrastructure property value. Indicates whether this tenant is a Microsoft infrastructure tenant.
     * @param value Value to set for the isMicrosoftInfrastructure property.
     */
    public void setIsMicrosoftInfrastructure(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isMicrosoftInfrastructure", value);
    }
    /**
     * Sets the multiTenantApplicationMetrics property value. The multiTenantApplicationMetrics property
     * @param value Value to set for the multiTenantApplicationMetrics property.
     */
    public void setMultiTenantApplicationMetrics(@jakarta.annotation.Nullable final MultiTenantApplicationMetrics value) {
        this.backingStore.set("multiTenantApplicationMetrics", value);
    }
}
