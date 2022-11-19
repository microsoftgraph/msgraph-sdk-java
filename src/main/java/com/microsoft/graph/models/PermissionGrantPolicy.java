package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PermissionGrantPolicy extends PolicyBase implements Parsable {
    /** Condition sets which are excluded in this permission grant policy. Automatically expanded on GET. */
    private java.util.List<PermissionGrantConditionSet> _excludes;
    /** Condition sets which are included in this permission grant policy. Automatically expanded on GET. */
    private java.util.List<PermissionGrantConditionSet> _includes;
    /**
     * Instantiates a new PermissionGrantPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PermissionGrantPolicy() {
        super();
        this.setOdataType("#microsoft.graph.permissionGrantPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PermissionGrantPolicy
     */
    @javax.annotation.Nonnull
    public static PermissionGrantPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PermissionGrantPolicy();
    }
    /**
     * Gets the excludes property value. Condition sets which are excluded in this permission grant policy. Automatically expanded on GET.
     * @return a permissionGrantConditionSet
     */
    @javax.annotation.Nullable
    public java.util.List<PermissionGrantConditionSet> getExcludes() {
        return this._excludes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PermissionGrantPolicy currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("excludes", (n) -> { currentObject.setExcludes(n.getCollectionOfObjectValues(PermissionGrantConditionSet::createFromDiscriminatorValue)); });
        deserializerMap.put("includes", (n) -> { currentObject.setIncludes(n.getCollectionOfObjectValues(PermissionGrantConditionSet::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the includes property value. Condition sets which are included in this permission grant policy. Automatically expanded on GET.
     * @return a permissionGrantConditionSet
     */
    @javax.annotation.Nullable
    public java.util.List<PermissionGrantConditionSet> getIncludes() {
        return this._includes;
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
        writer.writeCollectionOfObjectValues("excludes", this.getExcludes());
        writer.writeCollectionOfObjectValues("includes", this.getIncludes());
    }
    /**
     * Sets the excludes property value. Condition sets which are excluded in this permission grant policy. Automatically expanded on GET.
     * @param value Value to set for the excludes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludes(@javax.annotation.Nullable final java.util.List<PermissionGrantConditionSet> value) {
        this._excludes = value;
    }
    /**
     * Sets the includes property value. Condition sets which are included in this permission grant policy. Automatically expanded on GET.
     * @param value Value to set for the includes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludes(@javax.annotation.Nullable final java.util.List<PermissionGrantConditionSet> value) {
        this._includes = value;
    }
}
