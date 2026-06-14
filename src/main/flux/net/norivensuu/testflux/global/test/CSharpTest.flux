// using DealtWith;
// using System;
// using System.Collections;
// using System.Collections.Generic;
// using Unity.VisualScripting;
// using UnityEngine;
//
// [RequireComponent(typeof(Rigidbody))]
// [RequireComponent(typeof(BoxCollider))]
// [ExecuteInEditMode]
// public class FollowComponent
//  {
//     public new Rigidbody rigidbody;
//
//     public Transform follow;
//
//     public Vector3 offset;
//
//     public FollowMode followMode;
//     public float followSpeed = 10f;
//
//     private int followHash;
//
//     public override void UpdateBothComponent()
//     {
//         if (followMode == FollowMode.Bound || followMode == FollowMode.BoundStatic)
//         {
//             var _ = AutoComponent<BoxCollider>();
//         }
//     }
//
//     public void LateUpdate()
//     {
//         if (Util.CompareHashMix(followHash, out followHash, follow.transform.position, offset))
//         {
//             if (followMode == FollowMode.Static)
//             {
//                 transform.position = follow.transform.position + offset;
//             }
//             else if (followMode == FollowMode.Bound)
//             {
//                 Vector3 direction = follow.transform.position + offset - transform.position;
//                 Vector3 move = new(direction.x, 0, direction.z);
//
//                 var player = Global.Access<PlayerComponent>();
//
//                 rigidbody.linearVelocity = move * followSpeed;
//             }
//             else if (followMode == FollowMode.BoundStatic)
//             {
//                 rigidbody.linearVelocity = follow.GetComponent<Rigidbody>().linearVelocity;
//             }
//         }
//     }
// }
//
// public enum FollowMode
// {
//     None,
//     Static,
//     Bound,
//     BoundStatic
// }