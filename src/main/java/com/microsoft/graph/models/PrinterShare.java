package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrinterShare extends PrinterBase implements Parsable {
    /**
     * If true, all users and groups will be granted access to this printer share. This supersedes the allow lists defined by the allowedUsers and allowedGroups navigation properties.
     */
    private Boolean allowAllUsers;
    /**
     * The groups whose users have access to print using the printer.
     */
    private java.util.List<Group> allowedGroups;
    /**
     * The users who have access to print using the printer.
     */
    private java.util.List<User> allowedUsers;
    /**
     * The DateTimeOffset when the printer share was created. Read-only.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The printer that this printer share is related to.
     */
    private Printer printer;
    /**
     * Additional data for a printer share as viewed by the signed-in user.
     */
    private PrinterShareViewpoint viewPoint;
    /**
     * Instantiates a new printerShare and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public PrinterShare() {
        super();
        this.setOdataType("#microsoft.graph.printerShare");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printerShare
     */
    @jakarta.annotation.Nonnull
    public static PrinterShare createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrinterShare();
    }
    /**
     * Gets the allowAllUsers property value. If true, all users and groups will be granted access to this printer share. This supersedes the allow lists defined by the allowedUsers and allowedGroups navigation properties.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowAllUsers() {
        return this.allowAllUsers;
    }
    /**
     * Gets the allowedGroups property value. The groups whose users have access to print using the printer.
     * @return a group
     */
    @jakarta.annotation.Nullable
    public java.util.List<Group> getAllowedGroups() {
        return this.allowedGroups;
    }
    /**
     * Gets the allowedUsers property value. The users who have access to print using the printer.
     * @return a user
     */
    @jakarta.annotation.Nullable
    public java.util.List<User> getAllowedUsers() {
        return this.allowedUsers;
    }
    /**
     * Gets the createdDateTime property value. The DateTimeOffset when the printer share was created. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowAllUsers", (n) -> { this.setAllowAllUsers(n.getBooleanValue()); });
        deserializerMap.put("allowedGroups", (n) -> { this.setAllowedGroups(n.getCollectionOfObjectValues(Group::createFromDiscriminatorValue)); });
        deserializerMap.put("allowedUsers", (n) -> { this.setAllowedUsers(n.getCollectionOfObjectValues(User::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("printer", (n) -> { this.setPrinter(n.getObjectValue(Printer::createFromDiscriminatorValue)); });
        deserializerMap.put("viewPoint", (n) -> { this.setViewPoint(n.getObjectValue(PrinterShareViewpoint::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the printer property value. The printer that this printer share is related to.
     * @return a printer
     */
    @jakarta.annotation.Nullable
    public Printer getPrinter() {
        return this.printer;
    }
    /**
     * Gets the viewPoint property value. Additional data for a printer share as viewed by the signed-in user.
     * @return a printerShareViewpoint
     */
    @jakarta.annotation.Nullable
    public PrinterShareViewpoint getViewPoint() {
        return this.viewPoint;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowAllUsers", this.getAllowAllUsers());
        writer.writeCollectionOfObjectValues("allowedGroups", this.getAllowedGroups());
        writer.writeCollectionOfObjectValues("allowedUsers", this.getAllowedUsers());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("printer", this.getPrinter());
        writer.writeObjectValue("viewPoint", this.getViewPoint());
    }
    /**
     * Sets the allowAllUsers property value. If true, all users and groups will be granted access to this printer share. This supersedes the allow lists defined by the allowedUsers and allowedGroups navigation properties.
     * @param value Value to set for the allowAllUsers property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAllowAllUsers(@jakarta.annotation.Nullable final Boolean value) {
        this.allowAllUsers = value;
    }
    /**
     * Sets the allowedGroups property value. The groups whose users have access to print using the printer.
     * @param value Value to set for the allowedGroups property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAllowedGroups(@jakarta.annotation.Nullable final java.util.List<Group> value) {
        this.allowedGroups = value;
    }
    /**
     * Sets the allowedUsers property value. The users who have access to print using the printer.
     * @param value Value to set for the allowedUsers property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAllowedUsers(@jakarta.annotation.Nullable final java.util.List<User> value) {
        this.allowedUsers = value;
    }
    /**
     * Sets the createdDateTime property value. The DateTimeOffset when the printer share was created. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the printer property value. The printer that this printer share is related to.
     * @param value Value to set for the printer property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPrinter(@jakarta.annotation.Nullable final Printer value) {
        this.printer = value;
    }
    /**
     * Sets the viewPoint property value. Additional data for a printer share as viewed by the signed-in user.
     * @param value Value to set for the viewPoint property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setViewPoint(@jakarta.annotation.Nullable final PrinterShareViewpoint value) {
        this.viewPoint = value;
    }
}
