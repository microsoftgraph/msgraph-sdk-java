package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProvisioningSystem extends Identity implements Parsable {
    /** Details of the system. */
    private DetailsInfo _details;
    /**
     * Instantiates a new ProvisioningSystem and sets the default values.
     * @return a void
     */
    public ProvisioningSystem() {
        super();
        this.setOdataType("#microsoft.graph.provisioningSystem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProvisioningSystem
     */
    @javax.annotation.Nonnull
    public static ProvisioningSystem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProvisioningSystem();
    }
    /**
     * Gets the details property value. Details of the system.
     * @return a detailsInfo
     */
    @javax.annotation.Nullable
    public DetailsInfo getDetails() {
        return this._details;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ProvisioningSystem currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("details", (n) -> { currentObject.setDetails(n.getObjectValue(DetailsInfo::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("details", this.getDetails());
    }
    /**
     * Sets the details property value. Details of the system.
     * @param value Value to set for the details property.
     * @return a void
     */
    public void setDetails(@javax.annotation.Nullable final DetailsInfo value) {
        this._details = value;
    }
}
