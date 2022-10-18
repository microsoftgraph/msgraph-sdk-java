package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EdgeSearchEngine extends EdgeSearchEngineBase implements Parsable {
    /** Allows IT admind to set a predefined default search engine for MDM-Controlled devices */
    private EdgeSearchEngineType _edgeSearchEngineType;
    /**
     * Instantiates a new EdgeSearchEngine and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EdgeSearchEngine() {
        super();
        this.setOdataType("#microsoft.graph.edgeSearchEngine");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EdgeSearchEngine
     */
    @javax.annotation.Nonnull
    public static EdgeSearchEngine createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdgeSearchEngine();
    }
    /**
     * Gets the edgeSearchEngineType property value. Allows IT admind to set a predefined default search engine for MDM-Controlled devices
     * @return a edgeSearchEngineType
     */
    @javax.annotation.Nullable
    public EdgeSearchEngineType getEdgeSearchEngineType() {
        return this._edgeSearchEngineType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EdgeSearchEngine currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("edgeSearchEngineType", (n) -> { currentObject.setEdgeSearchEngineType(n.getEnumValue(EdgeSearchEngineType.class)); });
        }};
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
        writer.writeEnumValue("edgeSearchEngineType", this.getEdgeSearchEngineType());
    }
    /**
     * Sets the edgeSearchEngineType property value. Allows IT admind to set a predefined default search engine for MDM-Controlled devices
     * @param value Value to set for the edgeSearchEngineType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeSearchEngineType(@javax.annotation.Nullable final EdgeSearchEngineType value) {
        this._edgeSearchEngineType = value;
    }
}
