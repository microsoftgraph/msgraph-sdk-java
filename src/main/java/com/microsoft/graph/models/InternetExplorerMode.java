package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InternetExplorerMode extends Entity implements Parsable {
    /**
     * Instantiates a new InternetExplorerMode and sets the default values.
     */
    public InternetExplorerMode() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InternetExplorerMode
     */
    @jakarta.annotation.Nonnull
    public static InternetExplorerMode createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InternetExplorerMode();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("siteLists", (n) -> { this.setSiteLists(n.getCollectionOfObjectValues(BrowserSiteList::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the siteLists property value. A collection of site lists to support Internet Explorer mode.
     * @return a java.util.List<BrowserSiteList>
     */
    @jakarta.annotation.Nullable
    public java.util.List<BrowserSiteList> getSiteLists() {
        return this.backingStore.get("siteLists");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("siteLists", this.getSiteLists());
    }
    /**
     * Sets the siteLists property value. A collection of site lists to support Internet Explorer mode.
     * @param value Value to set for the siteLists property.
     */
    public void setSiteLists(@jakarta.annotation.Nullable final java.util.List<BrowserSiteList> value) {
        this.backingStore.set("siteLists", value);
    }
}
