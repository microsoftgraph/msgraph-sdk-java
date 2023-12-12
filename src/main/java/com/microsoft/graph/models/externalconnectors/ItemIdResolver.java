package com.microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemIdResolver extends UrlToItemResolverBase implements Parsable {
    /**
     * Instantiates a new ItemIdResolver and sets the default values.
     */
    public ItemIdResolver() {
        super();
        this.setOdataType("#microsoft.graph.externalConnectors.itemIdResolver");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ItemIdResolver
     */
    @jakarta.annotation.Nonnull
    public static ItemIdResolver createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemIdResolver();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("itemId", (n) -> { this.setItemId(n.getStringValue()); });
        deserializerMap.put("urlMatchInfo", (n) -> { this.setUrlMatchInfo(n.getObjectValue(UrlMatchInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the itemId property value. Pattern that specifies how to form the ID of the external item that the URL represents. The named groups from the regular expression in urlPattern within the urlMatchInfo can be referenced by inserting the group name inside curly brackets.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getItemId() {
        return this.backingStore.get("itemId");
    }
    /**
     * Gets the urlMatchInfo property value. Configurations to match and resolve URL.
     * @return a UrlMatchInfo
     */
    @jakarta.annotation.Nullable
    public UrlMatchInfo getUrlMatchInfo() {
        return this.backingStore.get("urlMatchInfo");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("itemId", this.getItemId());
        writer.writeObjectValue("urlMatchInfo", this.getUrlMatchInfo());
    }
    /**
     * Sets the itemId property value. Pattern that specifies how to form the ID of the external item that the URL represents. The named groups from the regular expression in urlPattern within the urlMatchInfo can be referenced by inserting the group name inside curly brackets.
     * @param value Value to set for the itemId property.
     */
    public void setItemId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("itemId", value);
    }
    /**
     * Sets the urlMatchInfo property value. Configurations to match and resolve URL.
     * @param value Value to set for the urlMatchInfo property.
     */
    public void setUrlMatchInfo(@jakarta.annotation.Nullable final UrlMatchInfo value) {
        this.backingStore.set("urlMatchInfo", value);
    }
}
