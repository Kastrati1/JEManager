package biz.objects;

import java.time.LocalDateTime;

import biz.EventDto;
import util.Util;

public class EventImpl implements biz.Event {
  private int eventId;
  private LocalDateTime date;
  private boolean closed = false;
  private int version = 0;

  public int getEventId() {
    return eventId;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public boolean isClosed() {
    return closed;
  }

  public void setEventId(int eventId) {
    Util.checkPositiveInteger(eventId);
    this.eventId = eventId;
  }

  public void setDate(LocalDateTime date) {
    Util.checkNull(date);
    this.date = date;
  }

  public void setClosed(boolean closed) {
    this.closed = closed;
  }

  @Override
  public void setVersion(int version) {
    this.version = version;
  }

  @Override
  public int getVersion() {
    return this.version;
  }

  /**
   * {@inheritDoc}.
   */
  public boolean isAfter(EventDto current) {
    LocalDateTime toCompare = LocalDateTime.now();
    if (current != null) {
      toCompare = current.getDate();
    }
    return this.date.isAfter(toCompare);
  }

  @Override
  public String getId() {
    return this.getClass().getName() + this.eventId;
  }
}
