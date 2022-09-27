package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CasesRoot extends Entity implements Parsable {
    /** The ediscoveryCases property */
    private java.util.List<EdiscoveryCase> _ediscoveryCases;
    /**
     * Instantiates a new casesRoot and sets the default values.
     * @return a void
     */
    public CasesRoot() {
        super();
        this.setOdataType("#microsoft.graph.security.casesRoot");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a casesRoot
     */
    @javax.annotation.Nonnull
    public static CasesRoot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CasesRoot();
    }
    /**
     * Gets the ediscoveryCases property value. The ediscoveryCases property
     * @return a ediscoveryCase
     */
    @javax.annotation.Nullable
    public java.util.List<EdiscoveryCase> getEdiscoveryCases() {
        return this._ediscoveryCases;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CasesRoot currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("ediscoveryCases", (n) -> { currentObject.setEdiscoveryCases(n.getCollectionOfObjectValues(EdiscoveryCase::createFromDiscriminatorValue)); });
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
        writer.writeCollectionOfObjectValues("ediscoveryCases", this.getEdiscoveryCases());
    }
    /**
     * Sets the ediscoveryCases property value. The ediscoveryCases property
     * @param value Value to set for the ediscoveryCases property.
     * @return a void
     */
    public void setEdiscoveryCases(@javax.annotation.Nullable final java.util.List<EdiscoveryCase> value) {
        this._ediscoveryCases = value;
    }
}
