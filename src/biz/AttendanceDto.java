package biz;

/**
 * This is the Attendance class's interface as seen from the servlet. The factory instantiates
 * Attendance objects with this interface as type, then hands the object over to the servlet. A UCC
 * may then cast said object into a fully functional "Attendance" interface type, granting him
 * access to all business-related methods.
 * 
 * @author Antoine.Maniet
 */
public interface AttendanceDto extends Dto {

  /**
   * @return The Attendance's id as assigned in the database during the insertion.
   */
  int getAttendanceId();

  /**
   * Retrieves the Contact from the DB with the ID contained in the ContactId field of the
   * Attendance.
   * 
   * @return The Attendance's contact as assigned in the database during the insertion.
   */
  Contact getContact();

  /**
   * Retrieves the Participation from the DB with the ID contained in the ParticipationId field of
   * the Attendance.
   * 
   * @return The Attendance's participation as assigned in the database during the insertion.
   */
  Participation getParticipation();

  /**
   * @return Whether or not the participation is confirmed.
   */
  boolean isConfirmed();

  /**
   * @author Antoine.Maniet
   * @param attendanceId The integer to set the field AttendanceId to
   * @exception IllegalArgumentException thrown if the attendanceId is a negative integer
   */
  void setAttendanceId(int attendanceId);

  /**
   * @author Antoine.Maniet
   * @param contact The contact to set the field Contact to
   * @exception IllegalArgumentException thrown if the contact is null
   */
  void setContact(Contact contact);

  /**
   * @author Antoine.Maniet
   * @param participation The Participation to set the field Participation to
   * @exception IllegalArgumentException thrown if the participation is null
   */
  void setParticipation(Participation participation);

  /**
   * @author Antoine.Maniet
   * @param confirmed The boolean to set the field Confirmed to
   */
  void setConfirmed(boolean confirmed);

  /**
   * @return The Attendance's contact's id as assigned in the database during the insertion.
   */
  public int getContactId();

  /**
   * @author Antoine.Maniet
   * @param contactId The integer to set the field ContactId to
   * @exception IllegalArgumentException thrown if the ContactId is a negative integer
   */
  public void setContactId(int contactId);

  /**
   * @return The Attendance's participation's id as assigned in the database during the insertion.
   */
  public int getParticipationId();

  /**
   * @author Antoine.Maniet
   * @param participationId The integer to set the field ParticipationId to
   * @exception IllegalArgumentException thrown if the ParticipationId is a negative integer
   */
  public void setParticipationId(int participationId);
}
