package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidMobileAppIdentifier extends MobileAppIdentifier implements Parsable {
    /** The identifier for an app, as specified in the play store. */
    private String packageId;
    /**
     * Instantiates a new AndroidMobileAppIdentifier and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidMobileAppIdentifier() {
        super();
        this.setOdataType("#microsoft.graph.androidMobileAppIdentifier");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidMobileAppIdentifier
     */
    @javax.annotation.Nonnull
    public static AndroidMobileAppIdentifier createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidMobileAppIdentifier();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("packageId", (n) -> { this.setPackageId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the packageId property value. The identifier for an app, as specified in the play store.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPackageId() {
        return this.packageId;
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
        writer.writeStringValue("packageId", this.getPackageId());
    }
    /**
     * Sets the packageId property value. The identifier for an app, as specified in the play store.
     * @param value Value to set for the packageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPackageId(@javax.annotation.Nullable final String value) {
        this.packageId = value;
    }
}
