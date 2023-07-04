package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ApplicationTemplate extends Entity implements Parsable {
    /**
     * The list of categories for the application. Supported values can be: Collaboration, Business Management, Consumer, Content management, CRM, Data services, Developer services, E-commerce, Education, ERP, Finance, Health, Human resources, IT infrastructure, Mail, Management, Marketing, Media, Productivity, Project management, Telecommunications, Tools, Travel, and Web design & hosting.
     */
    private java.util.List<String> categories;
    /**
     * A description of the application.
     */
    private String description;
    /**
     * The name of the application.
     */
    private String displayName;
    /**
     * The home page URL of the application.
     */
    private String homePageUrl;
    /**
     * The URL to get the logo for this application.
     */
    private String logoUrl;
    /**
     * The name of the publisher for this application.
     */
    private String publisher;
    /**
     * The list of provisioning modes supported by this application. The only valid value is sync.
     */
    private java.util.List<String> supportedProvisioningTypes;
    /**
     * The list of single sign-on modes supported by this application. The supported values are oidc, password, saml, and notSupported.
     */
    private java.util.List<String> supportedSingleSignOnModes;
    /**
     * Instantiates a new ApplicationTemplate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ApplicationTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ApplicationTemplate
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
        return this.categories;
    }
    /**
     * Gets the description property value. A description of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The name of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("homePageUrl", (n) -> { this.setHomePageUrl(n.getStringValue()); });
        deserializerMap.put("logoUrl", (n) -> { this.setLogoUrl(n.getStringValue()); });
        deserializerMap.put("publisher", (n) -> { this.setPublisher(n.getStringValue()); });
        deserializerMap.put("supportedProvisioningTypes", (n) -> { this.setSupportedProvisioningTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("supportedSingleSignOnModes", (n) -> { this.setSupportedSingleSignOnModes(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the homePageUrl property value. The home page URL of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHomePageUrl() {
        return this.homePageUrl;
    }
    /**
     * Gets the logoUrl property value. The URL to get the logo for this application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLogoUrl() {
        return this.logoUrl;
    }
    /**
     * Gets the publisher property value. The name of the publisher for this application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisher() {
        return this.publisher;
    }
    /**
     * Gets the supportedProvisioningTypes property value. The list of provisioning modes supported by this application. The only valid value is sync.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSupportedProvisioningTypes() {
        return this.supportedProvisioningTypes;
    }
    /**
     * Gets the supportedSingleSignOnModes property value. The list of single sign-on modes supported by this application. The supported values are oidc, password, saml, and notSupported.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSupportedSingleSignOnModes() {
        return this.supportedSingleSignOnModes;
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
    @javax.annotation.Nonnull
    public void setCategories(@javax.annotation.Nullable final java.util.List<String> value) {
        this.categories = value;
    }
    /**
     * Sets the description property value. A description of the application.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The name of the application.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the homePageUrl property value. The home page URL of the application.
     * @param value Value to set for the homePageUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHomePageUrl(@javax.annotation.Nullable final String value) {
        this.homePageUrl = value;
    }
    /**
     * Sets the logoUrl property value. The URL to get the logo for this application.
     * @param value Value to set for the logoUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLogoUrl(@javax.annotation.Nullable final String value) {
        this.logoUrl = value;
    }
    /**
     * Sets the publisher property value. The name of the publisher for this application.
     * @param value Value to set for the publisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublisher(@javax.annotation.Nullable final String value) {
        this.publisher = value;
    }
    /**
     * Sets the supportedProvisioningTypes property value. The list of provisioning modes supported by this application. The only valid value is sync.
     * @param value Value to set for the supportedProvisioningTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportedProvisioningTypes(@javax.annotation.Nullable final java.util.List<String> value) {
        this.supportedProvisioningTypes = value;
    }
    /**
     * Sets the supportedSingleSignOnModes property value. The list of single sign-on modes supported by this application. The supported values are oidc, password, saml, and notSupported.
     * @param value Value to set for the supportedSingleSignOnModes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportedSingleSignOnModes(@javax.annotation.Nullable final java.util.List<String> value) {
        this.supportedSingleSignOnModes = value;
    }
}
