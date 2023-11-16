package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Allows IT admins to set a custom default search engine for MDM-Controlled devices.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EdgeSearchEngineCustom extends EdgeSearchEngineBase implements Parsable {
    /**
     * Instantiates a new EdgeSearchEngineCustom and sets the default values.
     */
    public EdgeSearchEngineCustom() {
        super();
        this.setOdataType("#microsoft.graph.edgeSearchEngineCustom");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EdgeSearchEngineCustom
     */
    @jakarta.annotation.Nonnull
    public static EdgeSearchEngineCustom createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdgeSearchEngineCustom();
    }
    /**
     * Gets the edgeSearchEngineOpenSearchXmlUrl property value. Points to a https link containing the OpenSearch xml file that contains, at minimum, the short name and the URL to the search Engine.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEdgeSearchEngineOpenSearchXmlUrl() {
        return this.BackingStore.get("edgeSearchEngineOpenSearchXmlUrl");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("edgeSearchEngineOpenSearchXmlUrl", (n) -> { this.setEdgeSearchEngineOpenSearchXmlUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("edgeSearchEngineOpenSearchXmlUrl", this.getEdgeSearchEngineOpenSearchXmlUrl());
    }
    /**
     * Sets the edgeSearchEngineOpenSearchXmlUrl property value. Points to a https link containing the OpenSearch xml file that contains, at minimum, the short name and the URL to the search Engine.
     * @param value Value to set for the edgeSearchEngineOpenSearchXmlUrl property.
     */
    public void setEdgeSearchEngineOpenSearchXmlUrl(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("edgeSearchEngineOpenSearchXmlUrl", value);
    }
}
