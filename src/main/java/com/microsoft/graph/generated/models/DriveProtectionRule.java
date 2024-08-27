package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DriveProtectionRule extends ProtectionRuleBase implements Parsable {
    /**
     * Instantiates a new {@link DriveProtectionRule} and sets the default values.
     */
    public DriveProtectionRule() {
        super();
        this.setOdataType("#microsoft.graph.driveProtectionRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DriveProtectionRule}
     */
    @jakarta.annotation.Nonnull
    public static DriveProtectionRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DriveProtectionRule();
    }
    /**
     * Gets the driveExpression property value. Contains a drive expression. For examples, see driveExpression examples.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDriveExpression() {
        return this.backingStore.get("driveExpression");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("driveExpression", (n) -> { this.setDriveExpression(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("driveExpression", this.getDriveExpression());
    }
    /**
     * Sets the driveExpression property value. Contains a drive expression. For examples, see driveExpression examples.
     * @param value Value to set for the driveExpression property.
     */
    public void setDriveExpression(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("driveExpression", value);
    }
}
