/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pspHelper;

import java.util.EventListener;
import javax.swing.event.TableModelEvent;

/**
 *
 * @author YING LOPEZ
 */
public interface TableModelListener extends EventListener{
    public void tableChanged(TableModelEvent e);
}
