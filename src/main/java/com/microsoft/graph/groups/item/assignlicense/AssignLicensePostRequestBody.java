package com.microsoft.graph.groups.item.assignlicense;

import com.microsoft.graph.models.AssignedLicense;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssignLicensePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The addLicenses property
     */
    private java.util.List<AssignedLicense> addLicenses;
    /**
     * The removeLicenses property
     */
    private java.util.List<UUID> removeLicenses;
    /**
     * Instantiates a new AssignLicensePostRequestBody and sets the default values.
     */
    public AssignLicensePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AssignLicensePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static AssignLicensePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignLicensePostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the addLicenses property value. The addLicenses property
     * @return a java.util.List<AssignedLicense>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AssignedLicense> getAddLicenses() {
        return this.addLicenses;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("addLicenses", (n) -> { this.setAddLicenses(n.getCollectionOfObjectValues(AssignedLicense::createFromDiscriminatorValue)); });
        deserializerMap.put("removeLicenses", (n) -> { this.setRemoveLicenses(n.getCollectionOfPrimitiveValues(UUID.class)); });
        return deserializerMap;
    }
    /**
     * Gets the removeLicenses property value. The removeLicenses property
     * @return a java.util.List<UUID>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UUID> getRemoveLicenses() {
        return this.removeLicenses;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("addLicenses", this.getAddLicenses());
        writer.writeCollectionOfPrimitiveValues("removeLicenses", this.getRemoveLicenses());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the addLicenses property value. The addLicenses property
     * @param value Value to set for the addLicenses property.
     */
    public void setAddLicenses(@jakarta.annotation.Nullable final java.util.List<AssignedLicense> value) {
        this.addLicenses = value;
    }
    /**
     * Sets the removeLicenses property value. The removeLicenses property
     * @param value Value to set for the removeLicenses property.
     */
    public void setRemoveLicenses(@jakarta.annotation.Nullable final java.util.List<UUID> value) {
        this.removeLicenses = value;
    }
}
