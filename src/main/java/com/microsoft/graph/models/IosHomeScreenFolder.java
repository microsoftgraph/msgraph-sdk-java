package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosHomeScreenFolder extends IosHomeScreenItem implements Parsable {
    /** Pages of Home Screen Layout Icons which must be applications or web clips. This collection can contain a maximum of 500 elements. */
    private java.util.List<IosHomeScreenFolderPage> _pages;
    /**
     * Instantiates a new IosHomeScreenFolder and sets the default values.
     * @return a void
     */
    public IosHomeScreenFolder() {
        super();
        this.setOdataType("#microsoft.graph.iosHomeScreenFolder");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosHomeScreenFolder
     */
    @javax.annotation.Nonnull
    public static IosHomeScreenFolder createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosHomeScreenFolder();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosHomeScreenFolder currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("pages", (n) -> { currentObject.setPages(n.getCollectionOfObjectValues(IosHomeScreenFolderPage::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the pages property value. Pages of Home Screen Layout Icons which must be applications or web clips. This collection can contain a maximum of 500 elements.
     * @return a iosHomeScreenFolderPage
     */
    @javax.annotation.Nullable
    public java.util.List<IosHomeScreenFolderPage> getPages() {
        return this._pages;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("pages", this.getPages());
    }
    /**
     * Sets the pages property value. Pages of Home Screen Layout Icons which must be applications or web clips. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the pages property.
     * @return a void
     */
    public void setPages(@javax.annotation.Nullable final java.util.List<IosHomeScreenFolderPage> value) {
        this._pages = value;
    }
}
