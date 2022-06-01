package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of applicationTemplate entities. */
public class ApplicationTemplate extends Entity implements Parsable {
    /** The list of categories for the application. Supported values can be: Collaboration, Business Management, Consumer, Content management, CRM, Data services, Developer services, E-commerce, Education, ERP, Finance, Health, Human resources, IT infrastructure, Mail, Management, Marketing, Media, Productivity, Project management, Telecommunications, Tools, Travel, and Web design & hosting. */
    private java.util.List<String> _categories;
    /** A description of the application. */
    private String _description;
    /** The name of the application. */
    private String _displayName;
    /** The home page URL of the application. */
    private String _homePageUrl;
    /** The URL to get the logo for this application. */
    private String _logoUrl;
    /** The name of the publisher for this application. */
    private String _publisher;
    /** The list of provisioning modes supported by this application. The only valid value is sync. */
    private java.util.List<String> _supportedProvisioningTypes;
    /** The list of single sign-on modes supported by this application. The supported values are oidc, password, saml, and notSupported. */
    private java.util.List<String> _supportedSingleSignOnModes;
    /**
     * Instantiates a new applicationTemplate and sets the default values.
     * @return a void
     */
    public ApplicationTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a applicationTemplate
     */
    @javax.annotation.Nonnull
    public static ApplicationTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplicationTemplate();
    }
    /**
     * Gets the categories property value. The list of categories for the application. Supported values can be: Collaboration, Business Management, Consumer, Content management, CRM, Data services, Developer services, E-commerce, Education, ERP, Finance, Health, Human resources, IT infrastructure, Mail, Management, Marketing, Media, Productivity, Project management, Telecommunications, Tools, Travel, and Web design & hosting.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCategories() {
        return this._categories;
    }
    /**
     * Gets the description property value. A description of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The name of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ApplicationTemplate currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("categories", (n) -> { currentObject.setCategories(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("homePageUrl", (n) -> { currentObject.setHomePageUrl(n.getStringValue()); });
            this.put("logoUrl", (n) -> { currentObject.setLogoUrl(n.getStringValue()); });
            this.put("publisher", (n) -> { currentObject.setPublisher(n.getStringValue()); });
            this.put("supportedProvisioningTypes", (n) -> { currentObject.setSupportedProvisioningTypes(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("supportedSingleSignOnModes", (n) -> { currentObject.setSupportedSingleSignOnModes(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the homePageUrl property value. The home page URL of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHomePageUrl() {
        return this._homePageUrl;
    }
    /**
     * Gets the logoUrl property value. The URL to get the logo for this application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLogoUrl() {
        return this._logoUrl;
    }
    /**
     * Gets the publisher property value. The name of the publisher for this application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisher() {
        return this._publisher;
    }
    /**
     * Gets the supportedProvisioningTypes property value. The list of provisioning modes supported by this application. The only valid value is sync.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSupportedProvisioningTypes() {
        return this._supportedProvisioningTypes;
    }
    /**
     * Gets the supportedSingleSignOnModes property value. The list of single sign-on modes supported by this application. The supported values are oidc, password, saml, and notSupported.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSupportedSingleSignOnModes() {
        return this._supportedSingleSignOnModes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("categories", this.getCategories());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("homePageUrl", this.getHomePageUrl());
        writer.writeStringValue("logoUrl", this.getLogoUrl());
        writer.writeStringValue("publisher", this.getPublisher());
        writer.writeCollectionOfPrimitiveValues("supportedProvisioningTypes", this.getSupportedProvisioningTypes());
        writer.writeCollectionOfPrimitiveValues("supportedSingleSignOnModes", this.getSupportedSingleSignOnModes());
    }
    /**
     * Sets the categories property value. The list of categories for the application. Supported values can be: Collaboration, Business Management, Consumer, Content management, CRM, Data services, Developer services, E-commerce, Education, ERP, Finance, Health, Human resources, IT infrastructure, Mail, Management, Marketing, Media, Productivity, Project management, Telecommunications, Tools, Travel, and Web design & hosting.
     * @param value Value to set for the categories property.
     * @return a void
     */
    public void setCategories(@javax.annotation.Nullable final java.util.List<String> value) {
        this._categories = value;
    }
    /**
     * Sets the description property value. A description of the application.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The name of the application.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the homePageUrl property value. The home page URL of the application.
     * @param value Value to set for the homePageUrl property.
     * @return a void
     */
    public void setHomePageUrl(@javax.annotation.Nullable final String value) {
        this._homePageUrl = value;
    }
    /**
     * Sets the logoUrl property value. The URL to get the logo for this application.
     * @param value Value to set for the logoUrl property.
     * @return a void
     */
    public void setLogoUrl(@javax.annotation.Nullable final String value) {
        this._logoUrl = value;
    }
    /**
     * Sets the publisher property value. The name of the publisher for this application.
     * @param value Value to set for the publisher property.
     * @return a void
     */
    public void setPublisher(@javax.annotation.Nullable final String value) {
        this._publisher = value;
    }
    /**
     * Sets the supportedProvisioningTypes property value. The list of provisioning modes supported by this application. The only valid value is sync.
     * @param value Value to set for the supportedProvisioningTypes property.
     * @return a void
     */
    public void setSupportedProvisioningTypes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._supportedProvisioningTypes = value;
    }
    /**
     * Sets the supportedSingleSignOnModes property value. The list of single sign-on modes supported by this application. The supported values are oidc, password, saml, and notSupported.
     * @param value Value to set for the supportedSingleSignOnModes property.
     * @return a void
     */
    public void setSupportedSingleSignOnModes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._supportedSingleSignOnModes = value;
    }
}
