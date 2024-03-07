package mappers;

import model.Payment;
import utils.RowMapper;

import java.sql.ResultSet;

public class PaymentMapper implements RowMapper<Payment> {
    @Override
    public Payment mapRow(ResultSet rs) throws Exception {
        return new Payment(rs.getInt("payment_id"),
                            rs.getInt("customer_id"),
                            rs.getInt("staff_id"),
                            rs.getInt("rental_id"),
                            rs.getDouble("amount"),
                            rs.getTimestamp("payment_date"));
    }

    //private int payment_id;
    //
    //    private int customer_id;
    //
    //    private int staff_id;
    //
    //    private int rental_id;
    //
    //    private double amount;
    //
    //    private Timestamp payment_date;
}
