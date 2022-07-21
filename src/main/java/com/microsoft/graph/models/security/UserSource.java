package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserSource extends DataSource implements Parsable {
    /** Email address of the user's mailbox. */
    private String _email;
    /** Specifies which sources are included in this group. Possible values are: mailbox, site. */
    private SourceType _includedSources;
    /** The URL of the user's OneDrive for Business site. Read-only. */
    private String _siteWebUrl;
    /**
     * Instantiates a new UserSource and sets the default values.
     * @return a void
     */
    public UserSource() {
        super();
        this.setOdataType("#microsoft.graph.security.userSource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserSource
     */
    @javax.annotation.Nonnull
    public static UserSource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserSource();
    }
    /**
     * Gets the email property value. Email address of the user's mailbox.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return this._email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserSource currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("email", (n) -> { currentObject.setEmail(n.getStringValue()); });
            this.put("includedSources", (n) -> { currentObject.setIncludedSources(n.getEnumValue(SourceType.class)); });
            this.put("siteWebUrl", (n) -> { currentObject.setSiteWebUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the includedSources property value. Specifies which sources are included in this group. Possible values are: mailbox, site.
     * @return a sourceType
     */
    @javax.annotation.Nullable
    public SourceType getIncludedSources() {
        return this._includedSources;
    }
    /**
     * Gets the siteWebUrl property value. The URL of the user's OneDrive for Business site. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSiteWebUrl() {
        return this._siteWebUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("email", this.getEmail());
        writer.writeEnumValue("includedSources", this.getIncludedSources());
        writer.writeStringValue("siteWebUrl", this.getSiteWebUrl());
    }
    /**
     * Sets the email property value. Email address of the user's mailbox.
     * @param value Value to set for the email property.
     * @return a void
     */
    public void setEmail(@javax.annotation.Nullable final String value) {
        this._email = value;
    }
    /**
     * Sets the includedSources property value. Specifies which sources are included in this group. Possible values are: mailbox, site.
     * @param value Value to set for the includedSources property.
     * @return a void
     */
    public void setIncludedSources(@javax.annotation.Nullable final SourceType value) {
        this._includedSources = value;
    }
    /**
     * Sets the siteWebUrl property value. The URL of the user's OneDrive for Business site. Read-only.
     * @param value Value to set for the siteWebUrl property.
     * @return a void
     */
    public void setSiteWebUrl(@javax.annotation.Nullable final String value) {
        this._siteWebUrl = value;
    }
}
