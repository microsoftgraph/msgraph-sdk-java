package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains content properties for a specific app version. Each mobileAppContent can have multiple mobileAppContentFile. */
public class MobileAppContent extends Entity implements Parsable {
    /** The list of files for this app content version. */
    private java.util.List<MobileAppContentFile> _files;
    /**
     * Instantiates a new mobileAppContent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MobileAppContent() {
        super();
        this.setOdataType("#microsoft.graph.mobileAppContent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileAppContent
     */
    @javax.annotation.Nonnull
    public static MobileAppContent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppContent();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MobileAppContent currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("files", (n) -> { currentObject.setFiles(n.getCollectionOfObjectValues(MobileAppContentFile::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the files property value. The list of files for this app content version.
     * @return a mobileAppContentFile
     */
    @javax.annotation.Nullable
    public java.util.List<MobileAppContentFile> getFiles() {
        return this._files;
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
        writer.writeCollectionOfObjectValues("files", this.getFiles());
    }
    /**
     * Sets the files property value. The list of files for this app content version.
     * @param value Value to set for the files property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFiles(@javax.annotation.Nullable final java.util.List<MobileAppContentFile> value) {
        this._files = value;
    }
}
