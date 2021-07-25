﻿package Trainer;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author 20173189 김예진
 */
class Display_trainer_member extends Display_table {
// 검색한 회원의 운동 구성목록을 보여준다.
  @Override
  protected  void SetStatement() {
      
       String getname = frame_values.getUser_name();
       query =  "select * from sedb.trainer where user_name = +'"+getname+"' ";
  
  }
  protected void Addtablerow(){
      
      try {
          String user_id = rs.getString("USER_ID");
          String user_name = rs.getString("USER_NAME");
          String health_name = rs.getString("HEALTH_NAME");
          String health_set = rs.getString("HEALTH_SET");
          String health_count = rs.getString("HEALTH_COUNT");
          String health_time = rs.getString("HEALTH_TIME");
          
          model.addRow(new Object[] {user_id,user_name,health_name,health_set,health_count,health_count,health_time});
      } catch (SQLException ex) {
          Logger.getLogger(Display_trainer_member.class.getName()).log(Level.SEVERE, null, ex);
      }
      
  }

}
