package com.finalll.ticket_decorator;

/**
 * @InterfaceName Subject
 * @Description TODO
 * @Author Oneby
 * @Date 2023/12/8 14:17
 * @Version 1.0
 */
public interface Subject {
    void attach(TicketObserver observer);
    void detach(TicketObserver observer);
    void notifyObservers();
}
