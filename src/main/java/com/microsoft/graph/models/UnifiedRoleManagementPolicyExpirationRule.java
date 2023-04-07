package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleManagementPolicyExpirationRule extends UnifiedRoleManagementPolicyRule implements Parsable {
    /** Indicates whether expiration is required or if it's a permanently active assignment or eligibility. */
    private Boolean isExpirationRequired;
    /** The maximum duration allowed for eligibility or assignment which is not permanent. Required when isExpirationRequired is true. */
    private Period maximumDuration;
    /**
     * Instantiates a new UnifiedRoleManagementPolicyExpirationRule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnifiedRoleManagementPolicyExpirationRule() {
        super();
        this.setOdataType("#microsoft.graph.unifiedRoleManagementPolicyExpirationRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UnifiedRoleManagementPolicyExpirationRule
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleManagementPolicyExpirationRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleManagementPolicyExpirationRule();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isExpirationRequired", (n) -> { this.setIsExpirationRequired(n.getBooleanValue()); });
        deserializerMap.put("maximumDuration", (n) -> { this.setMaximumDuration(n.getPeriodValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isExpirationRequired property value. Indicates whether expiration is required or if it's a permanently active assignment or eligibility.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsExpirationRequired() {
        return this.isExpirationRequired;
    }
    /**
     * Gets the maximumDuration property value. The maximum duration allowed for eligibility or assignment which is not permanent. Required when isExpirationRequired is true.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getMaximumDuration() {
        return this.maximumDuration;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isExpirationRequired", this.getIsExpirationRequired());
        writer.writePeriodValue("maximumDuration", this.getMaximumDuration());
    }
    /**
     * Sets the isExpirationRequired property value. Indicates whether expiration is required or if it's a permanently active assignment or eligibility.
     * @param value Value to set for the isExpirationRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsExpirationRequired(@javax.annotation.Nullable final Boolean value) {
        this.isExpirationRequired = value;
    }
    /**
     * Sets the maximumDuration property value. The maximum duration allowed for eligibility or assignment which is not permanent. Required when isExpirationRequired is true.
     * @param value Value to set for the maximumDuration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumDuration(@javax.annotation.Nullable final Period value) {
        this.maximumDuration = value;
    }
}
