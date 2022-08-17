package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the admin singleton. */
public class PrinterShare extends PrinterBase implements Parsable {
    /** If true, all users and groups will be granted access to this printer share. This supersedes the allow lists defined by the allowedUsers and allowedGroups navigation properties. */
    private Boolean _allowAllUsers;
    /** The groups whose users have access to print using the printer. */
    private java.util.List<Group> _allowedGroups;
    /** The users who have access to print using the printer. */
    private java.util.List<User> _allowedUsers;
    /** The DateTimeOffset when the printer share was created. Read-only. */
    private OffsetDateTime _createdDateTime;
    /** The printer that this printer share is related to. */
    private Printer _printer;
    /**
     * Instantiates a new printerShare and sets the default values.
     * @return a void
     */
    public PrinterShare() {
        super();
        this.setOdataType("#microsoft.graph.printerShare");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printerShare
     */
    @javax.annotation.Nonnull
    public static PrinterShare createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrinterShare();
    }
    /**
     * Gets the allowAllUsers property value. If true, all users and groups will be granted access to this printer share. This supersedes the allow lists defined by the allowedUsers and allowedGroups navigation properties.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowAllUsers() {
        return this._allowAllUsers;
    }
    /**
     * Gets the allowedGroups property value. The groups whose users have access to print using the printer.
     * @return a group
     */
    @javax.annotation.Nullable
    public java.util.List<Group> getAllowedGroups() {
        return this._allowedGroups;
    }
    /**
     * Gets the allowedUsers property value. The users who have access to print using the printer.
     * @return a user
     */
    @javax.annotation.Nullable
    public java.util.List<User> getAllowedUsers() {
        return this._allowedUsers;
    }
    /**
     * Gets the createdDateTime property value. The DateTimeOffset when the printer share was created. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrinterShare currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("allowAllUsers", (n) -> { currentObject.setAllowAllUsers(n.getBooleanValue()); });
            this.put("allowedGroups", (n) -> { currentObject.setAllowedGroups(n.getCollectionOfObjectValues(Group::createFromDiscriminatorValue)); });
            this.put("allowedUsers", (n) -> { currentObject.setAllowedUsers(n.getCollectionOfObjectValues(User::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("printer", (n) -> { currentObject.setPrinter(n.getObjectValue(Printer::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the printer property value. The printer that this printer share is related to.
     * @return a printer
     */
    @javax.annotation.Nullable
    public Printer getPrinter() {
        return this._printer;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowAllUsers", this.getAllowAllUsers());
        writer.writeCollectionOfObjectValues("allowedGroups", this.getAllowedGroups());
        writer.writeCollectionOfObjectValues("allowedUsers", this.getAllowedUsers());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("printer", this.getPrinter());
    }
    /**
     * Sets the allowAllUsers property value. If true, all users and groups will be granted access to this printer share. This supersedes the allow lists defined by the allowedUsers and allowedGroups navigation properties.
     * @param value Value to set for the allowAllUsers property.
     * @return a void
     */
    public void setAllowAllUsers(@javax.annotation.Nullable final Boolean value) {
        this._allowAllUsers = value;
    }
    /**
     * Sets the allowedGroups property value. The groups whose users have access to print using the printer.
     * @param value Value to set for the allowedGroups property.
     * @return a void
     */
    public void setAllowedGroups(@javax.annotation.Nullable final java.util.List<Group> value) {
        this._allowedGroups = value;
    }
    /**
     * Sets the allowedUsers property value. The users who have access to print using the printer.
     * @param value Value to set for the allowedUsers property.
     * @return a void
     */
    public void setAllowedUsers(@javax.annotation.Nullable final java.util.List<User> value) {
        this._allowedUsers = value;
    }
    /**
     * Sets the createdDateTime property value. The DateTimeOffset when the printer share was created. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the printer property value. The printer that this printer share is related to.
     * @param value Value to set for the printer property.
     * @return a void
     */
    public void setPrinter(@javax.annotation.Nullable final Printer value) {
        this._printer = value;
    }
}
