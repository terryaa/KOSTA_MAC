/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import GUI.Grace_GUI;

/**
 *
 * @author KOSTA
 */
public interface HandleServerMessage {

    /**
     *
     * @param msg
     */
    public boolean handledata(String msg,Grace_GUI gui);
}