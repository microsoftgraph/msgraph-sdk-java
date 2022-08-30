package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationTeamsAppResource extends EducationResource implements Parsable {
    /** The appIconWebUrl property */
    private String _appIconWebUrl;
    /** The appId property */
    private String _appId;
    /** The teamsEmbeddedContentUrl property */
    private String _teamsEmbeddedContentUrl;
    /** The webUrl property */
    private String _webUrl;
    /**
     * Instantiates a new EducationTeamsAppResource and sets the default values.
     * @return a void
     */
    public EducationTeamsAppResource() {
        super();
        this.setOdataType("#microsoft.graph.educationTeamsAppResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationTeamsAppResource
     */
    @javax.annotation.Nonnull
    public static EducationTeamsAppResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationTeamsAppResource();
    }
    /**
     * Gets the appIconWebUrl property value. The appIconWebUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppIconWebUrl() {
        return this._appIconWebUrl;
    }
    /**
     * Gets the appId property value. The appId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this._appId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationTeamsAppResource currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appIconWebUrl", (n) -> { currentObject.setAppIconWebUrl(n.getStringValue()); });
            this.put("appId", (n) -> { currentObject.setAppId(n.getStringValue()); });
            this.put("teamsEmbeddedContentUrl", (n) -> { currentObject.setTeamsEmbeddedContentUrl(n.getStringValue()); });
            this.put("webUrl", (n) -> { currentObject.setWebUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the teamsEmbeddedContentUrl property value. The teamsEmbeddedContentUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTeamsEmbeddedContentUrl() {
        return this._teamsEmbeddedContentUrl;
    }
    /**
     * Gets the webUrl property value. The webUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this._webUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appIconWebUrl", this.getAppIconWebUrl());
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("teamsEmbeddedContentUrl", this.getTeamsEmbeddedContentUrl());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the appIconWebUrl property value. The appIconWebUrl property
     * @param value Value to set for the appIconWebUrl property.
     * @return a void
     */
    public void setAppIconWebUrl(@javax.annotation.Nullable final String value) {
        this._appIconWebUrl = value;
    }
    /**
     * Sets the appId property value. The appId property
     * @param value Value to set for the appId property.
     * @return a void
     */
    public void setAppId(@javax.annotation.Nullable final String value) {
        this._appId = value;
    }
    /**
     * Sets the teamsEmbeddedContentUrl property value. The teamsEmbeddedContentUrl property
     * @param value Value to set for the teamsEmbeddedContentUrl property.
     * @return a void
     */
    public void setTeamsEmbeddedContentUrl(@javax.annotation.Nullable final String value) {
        this._teamsEmbeddedContentUrl = value;
    }
    /**
     * Sets the webUrl property value. The webUrl property
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}
