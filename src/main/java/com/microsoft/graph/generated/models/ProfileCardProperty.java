package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProfileCardProperty extends Entity implements Parsable {
    /**
     * Instantiates a new ProfileCardProperty and sets the default values.
     */
    public ProfileCardProperty() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProfileCardProperty
     */
    @jakarta.annotation.Nonnull
    public static ProfileCardProperty createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProfileCardProperty();
    }
    /**
     * Gets the annotations property value. Allows an administrator to set a custom display label for the directory property and localize it for the users in their tenant.
     * @return a java.util.List<ProfileCardAnnotation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProfileCardAnnotation> getAnnotations() {
        return this.backingStore.get("annotations");
    }
    /**
     * Gets the directoryPropertyName property value. Identifies a profileCardProperty resource in Get, Update, or Delete operations. Allows an administrator to surface hidden Microsoft Entra ID properties on the Microsoft 365 profile card within their tenant. When present, the Microsoft Entra ID field referenced in this property is visible to all users in your tenant on the contact pane of the profile card. Allowed values for this field are: UserPrincipalName, Fax, StreetAddress, PostalCode, StateOrProvince, Alias, CustomAttribute1,  CustomAttribute2, CustomAttribute3, CustomAttribute4, CustomAttribute5, CustomAttribute6, CustomAttribute7, CustomAttribute8, CustomAttribute9, CustomAttribute10, CustomAttribute11, CustomAttribute12, CustomAttribute13, CustomAttribute14, CustomAttribute15.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDirectoryPropertyName() {
        return this.backingStore.get("directoryPropertyName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("annotations", (n) -> { this.setAnnotations(n.getCollectionOfObjectValues(ProfileCardAnnotation::createFromDiscriminatorValue)); });
        deserializerMap.put("directoryPropertyName", (n) -> { this.setDirectoryPropertyName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("annotations", this.getAnnotations());
        writer.writeStringValue("directoryPropertyName", this.getDirectoryPropertyName());
    }
    /**
     * Sets the annotations property value. Allows an administrator to set a custom display label for the directory property and localize it for the users in their tenant.
     * @param value Value to set for the annotations property.
     */
    public void setAnnotations(@jakarta.annotation.Nullable final java.util.List<ProfileCardAnnotation> value) {
        this.backingStore.set("annotations", value);
    }
    /**
     * Sets the directoryPropertyName property value. Identifies a profileCardProperty resource in Get, Update, or Delete operations. Allows an administrator to surface hidden Microsoft Entra ID properties on the Microsoft 365 profile card within their tenant. When present, the Microsoft Entra ID field referenced in this property is visible to all users in your tenant on the contact pane of the profile card. Allowed values for this field are: UserPrincipalName, Fax, StreetAddress, PostalCode, StateOrProvince, Alias, CustomAttribute1,  CustomAttribute2, CustomAttribute3, CustomAttribute4, CustomAttribute5, CustomAttribute6, CustomAttribute7, CustomAttribute8, CustomAttribute9, CustomAttribute10, CustomAttribute11, CustomAttribute12, CustomAttribute13, CustomAttribute14, CustomAttribute15.
     * @param value Value to set for the directoryPropertyName property.
     */
    public void setDirectoryPropertyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("directoryPropertyName", value);
    }
}
