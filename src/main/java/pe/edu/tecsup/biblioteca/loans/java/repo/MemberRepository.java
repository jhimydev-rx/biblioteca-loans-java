/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.tecsup.biblioteca.loans.java.repo;

/**
 *
 * @author chboy
 */
import pe.edu.tecsup.biblioteca.loans.java.model.Member;
import java.util.Optional;

public interface MemberRepository {
    Optional<Member> findById(String id);
    void save(Member member);
}