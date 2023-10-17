package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OutlookUser extends Entity implements Parsable {
    /**
     * A list of categories defined for the user.
     */
    private java.util.List<OutlookCategory> masterCategories;
    /**
     * Instantiates a new OutlookUser and sets the default values.
     */
    public OutlookUser() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OutlookUser
     */
    @jakarta.annotation.Nonnull
    public static OutlookUser createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutlookUser();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("masterCategories", (n) -> { this.setMasterCategories(n.getCollectionOfObjectValues(OutlookCategory::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the masterCategories property value. A list of categories defined for the user.
     * @return a java.util.List<OutlookCategory>
     */
    @jakarta.annotation.Nullable
    public java.util.List<OutlookCategory> getMasterCategories() {
        return this.masterCategories;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("masterCategories", this.getMasterCategories());
    }
    /**
     * Sets the masterCategories property value. A list of categories defined for the user.
     * @param value Value to set for the masterCategories property.
     */
    public void setMasterCategories(@jakarta.annotation.Nullable final java.util.List<OutlookCategory> value) {
        this.masterCategories = value;
    }
}
