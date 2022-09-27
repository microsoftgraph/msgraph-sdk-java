package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleManagementPolicyExpirationRule extends UnifiedRoleManagementPolicyRule implements Parsable {
    /** Indicates whether expiration is required or if it's a permanently active assignment or eligibility. */
    private Boolean _isExpirationRequired;
    /** The maximum duration allowed for eligibility or assignment which is not permanent. Required when isExpirationRequired is true. */
    private Period _maximumDuration;
    /**
     * Instantiates a new UnifiedRoleManagementPolicyExpirationRule and sets the default values.
     * @return a void
     */
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
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UnifiedRoleManagementPolicyExpirationRule currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("isExpirationRequired", (n) -> { currentObject.setIsExpirationRequired(n.getBooleanValue()); });
            this.put("maximumDuration", (n) -> { currentObject.setMaximumDuration(n.getPeriodValue()); });
        }};
    }
    /**
     * Gets the isExpirationRequired property value. Indicates whether expiration is required or if it's a permanently active assignment or eligibility.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsExpirationRequired() {
        return this._isExpirationRequired;
    }
    /**
     * Gets the maximumDuration property value. The maximum duration allowed for eligibility or assignment which is not permanent. Required when isExpirationRequired is true.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getMaximumDuration() {
        return this._maximumDuration;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setIsExpirationRequired(@javax.annotation.Nullable final Boolean value) {
        this._isExpirationRequired = value;
    }
    /**
     * Sets the maximumDuration property value. The maximum duration allowed for eligibility or assignment which is not permanent. Required when isExpirationRequired is true.
     * @param value Value to set for the maximumDuration property.
     * @return a void
     */
    public void setMaximumDuration(@javax.annotation.Nullable final Period value) {
        this._maximumDuration = value;
    }
}
