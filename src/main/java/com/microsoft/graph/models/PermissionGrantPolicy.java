package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PermissionGrantPolicy extends PolicyBase implements Parsable {
    /**
     * Condition sets which are excluded in this permission grant policy. Automatically expanded on GET.
     */
    private java.util.List<PermissionGrantConditionSet> excludes;
    /**
     * Condition sets which are included in this permission grant policy. Automatically expanded on GET.
     */
    private java.util.List<PermissionGrantConditionSet> includes;
    /**
     * Instantiates a new permissionGrantPolicy and sets the default values.
     */
    public PermissionGrantPolicy() {
        super();
        this.setOdataType("#microsoft.graph.permissionGrantPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a permissionGrantPolicy
     */
    @jakarta.annotation.Nonnull
    public static PermissionGrantPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PermissionGrantPolicy();
    }
    /**
     * Gets the excludes property value. Condition sets which are excluded in this permission grant policy. Automatically expanded on GET.
     * @return a permissionGrantConditionSet
     */
    @jakarta.annotation.Nullable
    public java.util.List<PermissionGrantConditionSet> getExcludes() {
        return this.excludes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("excludes", (n) -> { this.setExcludes(n.getCollectionOfObjectValues(PermissionGrantConditionSet::createFromDiscriminatorValue)); });
        deserializerMap.put("includes", (n) -> { this.setIncludes(n.getCollectionOfObjectValues(PermissionGrantConditionSet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the includes property value. Condition sets which are included in this permission grant policy. Automatically expanded on GET.
     * @return a permissionGrantConditionSet
     */
    @jakarta.annotation.Nullable
    public java.util.List<PermissionGrantConditionSet> getIncludes() {
        return this.includes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("excludes", this.getExcludes());
        writer.writeCollectionOfObjectValues("includes", this.getIncludes());
    }
    /**
     * Sets the excludes property value. Condition sets which are excluded in this permission grant policy. Automatically expanded on GET.
     * @param value Value to set for the excludes property.
     */
    public void setExcludes(@jakarta.annotation.Nullable final java.util.List<PermissionGrantConditionSet> value) {
        this.excludes = value;
    }
    /**
     * Sets the includes property value. Condition sets which are included in this permission grant policy. Automatically expanded on GET.
     * @param value Value to set for the includes property.
     */
    public void setIncludes(@jakarta.annotation.Nullable final java.util.List<PermissionGrantConditionSet> value) {
        this.includes = value;
    }
}
