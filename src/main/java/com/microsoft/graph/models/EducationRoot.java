package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationRoot implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The classes property */
    private java.util.List<EducationClass> classes;
    /** The me property */
    private EducationUser me;
    /** The OdataType property */
    private String odataType;
    /** The schools property */
    private java.util.List<EducationSchool> schools;
    /** The users property */
    private java.util.List<EducationUser> users;
    /**
     * Instantiates a new EducationRoot and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationRoot() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationRoot
     */
    @javax.annotation.Nonnull
    public static EducationRoot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationRoot();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the classes property value. The classes property
     * @return a educationClass
     */
    @javax.annotation.Nullable
    public java.util.List<EducationClass> getClasses() {
        return this.classes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("classes", (n) -> { this.setClasses(n.getCollectionOfObjectValues(EducationClass::createFromDiscriminatorValue)); });
        deserializerMap.put("me", (n) -> { this.setMe(n.getObjectValue(EducationUser::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("schools", (n) -> { this.setSchools(n.getCollectionOfObjectValues(EducationSchool::createFromDiscriminatorValue)); });
        deserializerMap.put("users", (n) -> { this.setUsers(n.getCollectionOfObjectValues(EducationUser::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the me property value. The me property
     * @return a educationUser
     */
    @javax.annotation.Nullable
    public EducationUser getMe() {
        return this.me;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the schools property value. The schools property
     * @return a educationSchool
     */
    @javax.annotation.Nullable
    public java.util.List<EducationSchool> getSchools() {
        return this.schools;
    }
    /**
     * Gets the users property value. The users property
     * @return a educationUser
     */
    @javax.annotation.Nullable
    public java.util.List<EducationUser> getUsers() {
        return this.users;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("classes", this.getClasses());
        writer.writeObjectValue("me", this.getMe());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("schools", this.getSchools());
        writer.writeCollectionOfObjectValues("users", this.getUsers());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the classes property value. The classes property
     * @param value Value to set for the classes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClasses(@javax.annotation.Nullable final java.util.List<EducationClass> value) {
        this.classes = value;
    }
    /**
     * Sets the me property value. The me property
     * @param value Value to set for the me property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMe(@javax.annotation.Nullable final EducationUser value) {
        this.me = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the schools property value. The schools property
     * @param value Value to set for the schools property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchools(@javax.annotation.Nullable final java.util.List<EducationSchool> value) {
        this.schools = value;
    }
    /**
     * Sets the users property value. The users property
     * @param value Value to set for the users property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsers(@javax.annotation.Nullable final java.util.List<EducationUser> value) {
        this.users = value;
    }
}
