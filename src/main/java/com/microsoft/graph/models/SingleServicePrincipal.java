package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SingleServicePrincipal extends SubjectSet implements Parsable {
    /** Description of this service principal. */
    private String _description;
    /** ID of the servicePrincipal. */
    private String _servicePrincipalId;
    /**
     * Instantiates a new SingleServicePrincipal and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SingleServicePrincipal() {
        super();
        this.setOdataType("#microsoft.graph.singleServicePrincipal");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SingleServicePrincipal
     */
    @javax.annotation.Nonnull
    public static SingleServicePrincipal createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SingleServicePrincipal();
    }
    /**
     * Gets the description property value. Description of this service principal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SingleServicePrincipal currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("servicePrincipalId", (n) -> { currentObject.setServicePrincipalId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the servicePrincipalId property value. ID of the servicePrincipal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePrincipalId() {
        return this._servicePrincipalId;
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
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("servicePrincipalId", this.getServicePrincipalId());
    }
    /**
     * Sets the description property value. Description of this service principal.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the servicePrincipalId property value. ID of the servicePrincipal.
     * @param value Value to set for the servicePrincipalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePrincipalId(@javax.annotation.Nullable final String value) {
        this._servicePrincipalId = value;
    }
}
