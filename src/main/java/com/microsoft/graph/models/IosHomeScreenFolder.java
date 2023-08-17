package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A folder containing pages of apps and web clips on the Home Screen.
 */
public class IosHomeScreenFolder extends IosHomeScreenItem implements Parsable {
    /**
     * Pages of Home Screen Layout Icons which must be applications or web clips. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<IosHomeScreenFolderPage> pages;
    /**
     * Instantiates a new iosHomeScreenFolder and sets the default values.
     */
    public IosHomeScreenFolder() {
        super();
        this.setOdataType("#microsoft.graph.iosHomeScreenFolder");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosHomeScreenFolder
     */
    @jakarta.annotation.Nonnull
    public static IosHomeScreenFolder createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosHomeScreenFolder();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("pages", (n) -> { this.setPages(n.getCollectionOfObjectValues(IosHomeScreenFolderPage::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the pages property value. Pages of Home Screen Layout Icons which must be applications or web clips. This collection can contain a maximum of 500 elements.
     * @return a iosHomeScreenFolderPage
     */
    @jakarta.annotation.Nullable
    public java.util.List<IosHomeScreenFolderPage> getPages() {
        return this.pages;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("pages", this.getPages());
    }
    /**
     * Sets the pages property value. Pages of Home Screen Layout Icons which must be applications or web clips. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the pages property.
     */
    public void setPages(@jakarta.annotation.Nullable final java.util.List<IosHomeScreenFolderPage> value) {
        this.pages = value;
    }
}
