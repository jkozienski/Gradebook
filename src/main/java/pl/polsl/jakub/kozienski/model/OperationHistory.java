/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.jakub.kozienski.model;
import java.time.LocalDateTime;

/**
 *
 * @author Jakub
 */
public record OperationHistory(String operation, LocalDateTime timestamp) {}
