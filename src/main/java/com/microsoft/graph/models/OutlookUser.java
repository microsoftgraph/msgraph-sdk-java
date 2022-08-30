package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OutlookUser extends Entity implements Parsable {
    /** A list of categories defined for the user. */
    private java.util.List<OutlookCategory> _masterCategories;
    /**
     * Instantiates a new outlookUser and sets the default values.
     * @return a void
     */
    public OutlookUser() {
        super();
        this.setOdataType("#microsoft.graph.outlookUser");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a outlookUser
     */
    @javax.annotation.Nonnull
    public static OutlookUser createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutlookUser();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OutlookUser currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("masterCategories", (n) -> { currentObject.setMasterCategories(n.getCollectionOfObjectValues(OutlookCategory::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the masterCategories property value. A list of categories defined for the user.
     * @return a outlookCategory
     */
    @javax.annotation.Nullable
    public java.util.List<OutlookCategory> getMasterCategories() {
        return this._masterCategories;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("masterCategories", this.getMasterCategories());
    }
    /**
     * Sets the masterCategories property value. A list of categories defined for the user.
     * @param value Value to set for the masterCategories property.
     * @return a void
     */
    public void setMasterCategories(@javax.annotation.Nullable final java.util.List<OutlookCategory> value) {
        this._masterCategories = value;
    }
}
