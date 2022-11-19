package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EdgeSearchEngineCustom extends EdgeSearchEngineBase implements Parsable {
    /** Points to a https link containing the OpenSearch xml file that contains, at minimum, the short name and the URL to the search Engine. */
    private String _edgeSearchEngineOpenSearchXmlUrl;
    /**
     * Instantiates a new EdgeSearchEngineCustom and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EdgeSearchEngineCustom() {
        super();
        this.setOdataType("#microsoft.graph.edgeSearchEngineCustom");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EdgeSearchEngineCustom
     */
    @javax.annotation.Nonnull
    public static EdgeSearchEngineCustom createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdgeSearchEngineCustom();
    }
    /**
     * Gets the edgeSearchEngineOpenSearchXmlUrl property value. Points to a https link containing the OpenSearch xml file that contains, at minimum, the short name and the URL to the search Engine.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEdgeSearchEngineOpenSearchXmlUrl() {
        return this._edgeSearchEngineOpenSearchXmlUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EdgeSearchEngineCustom currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("edgeSearchEngineOpenSearchXmlUrl", (n) -> { currentObject.setEdgeSearchEngineOpenSearchXmlUrl(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeStringValue("edgeSearchEngineOpenSearchXmlUrl", this.getEdgeSearchEngineOpenSearchXmlUrl());
    }
    /**
     * Sets the edgeSearchEngineOpenSearchXmlUrl property value. Points to a https link containing the OpenSearch xml file that contains, at minimum, the short name and the URL to the search Engine.
     * @param value Value to set for the edgeSearchEngineOpenSearchXmlUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeSearchEngineOpenSearchXmlUrl(@javax.annotation.Nullable final String value) {
        this._edgeSearchEngineOpenSearchXmlUrl = value;
    }
}
