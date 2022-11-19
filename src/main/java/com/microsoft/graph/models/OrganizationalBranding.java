package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OrganizationalBranding extends OrganizationalBrandingProperties implements Parsable {
    /** Add different branding based on a locale. */
    private java.util.List<OrganizationalBrandingLocalization> _localizations;
    /**
     * Instantiates a new OrganizationalBranding and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OrganizationalBranding() {
        super();
        this.setOdataType("#microsoft.graph.organizationalBranding");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationalBranding
     */
    @javax.annotation.Nonnull
    public static OrganizationalBranding createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationalBranding();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OrganizationalBranding currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("localizations", (n) -> { currentObject.setLocalizations(n.getCollectionOfObjectValues(OrganizationalBrandingLocalization::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the localizations property value. Add different branding based on a locale.
     * @return a organizationalBrandingLocalization
     */
    @javax.annotation.Nullable
    public java.util.List<OrganizationalBrandingLocalization> getLocalizations() {
        return this._localizations;
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
        writer.writeCollectionOfObjectValues("localizations", this.getLocalizations());
    }
    /**
     * Sets the localizations property value. Add different branding based on a locale.
     * @param value Value to set for the localizations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalizations(@javax.annotation.Nullable final java.util.List<OrganizationalBrandingLocalization> value) {
        this._localizations = value;
    }
}
