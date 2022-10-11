package com.microsoft.graph.deviceappmanagement.mobileapps.item.assign;

import com.microsoft.graph.models.MobileAppAssignment;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the assign method. */
public class AssignPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The mobileAppAssignments property */
    private java.util.List<MobileAppAssignment> _mobileAppAssignments;
    /**
     * Instantiates a new assignPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AssignPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a assignPostRequestBody
     */
    @javax.annotation.Nonnull
    public static AssignPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AssignPostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(1) {{
            this.put("mobileAppAssignments", (n) -> { currentObject.setMobileAppAssignments(n.getCollectionOfObjectValues(MobileAppAssignment::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the mobileAppAssignments property value. The mobileAppAssignments property
     * @return a mobileAppAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<MobileAppAssignment> getMobileAppAssignments() {
        return this._mobileAppAssignments;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("mobileAppAssignments", this.getMobileAppAssignments());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the mobileAppAssignments property value. The mobileAppAssignments property
     * @param value Value to set for the mobileAppAssignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobileAppAssignments(@javax.annotation.Nullable final java.util.List<MobileAppAssignment> value) {
        this._mobileAppAssignments = value;
    }
}
