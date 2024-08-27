package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OneDriveForBusinessProtectionPolicy extends ProtectionPolicyBase implements Parsable {
    /**
     * Instantiates a new {@link OneDriveForBusinessProtectionPolicy} and sets the default values.
     */
    public OneDriveForBusinessProtectionPolicy() {
        super();
        this.setOdataType("#microsoft.graph.oneDriveForBusinessProtectionPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OneDriveForBusinessProtectionPolicy}
     */
    @jakarta.annotation.Nonnull
    public static OneDriveForBusinessProtectionPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OneDriveForBusinessProtectionPolicy();
    }
    /**
     * Gets the driveInclusionRules property value. Contains the details of the Onedrive for Business protection rule.
     * @return a {@link java.util.List<DriveProtectionRule>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DriveProtectionRule> getDriveInclusionRules() {
        return this.backingStore.get("driveInclusionRules");
    }
    /**
     * Gets the driveProtectionUnits property value. Contains the protection units associated with a  OneDrive for Business protection policy.
     * @return a {@link java.util.List<DriveProtectionUnit>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DriveProtectionUnit> getDriveProtectionUnits() {
        return this.backingStore.get("driveProtectionUnits");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("driveInclusionRules", (n) -> { this.setDriveInclusionRules(n.getCollectionOfObjectValues(DriveProtectionRule::createFromDiscriminatorValue)); });
        deserializerMap.put("driveProtectionUnits", (n) -> { this.setDriveProtectionUnits(n.getCollectionOfObjectValues(DriveProtectionUnit::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("driveInclusionRules", this.getDriveInclusionRules());
        writer.writeCollectionOfObjectValues("driveProtectionUnits", this.getDriveProtectionUnits());
    }
    /**
     * Sets the driveInclusionRules property value. Contains the details of the Onedrive for Business protection rule.
     * @param value Value to set for the driveInclusionRules property.
     */
    public void setDriveInclusionRules(@jakarta.annotation.Nullable final java.util.List<DriveProtectionRule> value) {
        this.backingStore.set("driveInclusionRules", value);
    }
    /**
     * Sets the driveProtectionUnits property value. Contains the protection units associated with a  OneDrive for Business protection policy.
     * @param value Value to set for the driveProtectionUnits property.
     */
    public void setDriveProtectionUnits(@jakarta.annotation.Nullable final java.util.List<DriveProtectionUnit> value) {
        this.backingStore.set("driveProtectionUnits", value);
    }
}
