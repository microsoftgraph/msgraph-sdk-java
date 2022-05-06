package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the organizationalBranding singleton.  */
public class OrganizationalBranding extends OrganizationalBrandingProperties implements Parsable {
    /** Add different branding based on a locale.  */
    private java.util.List<OrganizationalBrandingLocalization> _localizations;
    /**
     * Instantiates a new organizationalBranding and sets the default values.
     * @return a void
     */
    public OrganizationalBranding() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a organizationalBranding
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
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("localizations", (n) -> { currentObject.setLocalizations(n.getCollectionOfObjectValues(OrganizationalBrandingLocalization::createFromDiscriminatorValue)); });
        }};
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
    public void setLocalizations(@javax.annotation.Nullable final java.util.List<OrganizationalBrandingLocalization> value) {
        this._localizations = value;
    }
}
